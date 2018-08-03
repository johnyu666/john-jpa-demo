package cn.johnyu.jpa.id;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.id.uuid.CustomVersionOneStrategy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.johnyu.jpa.converter.pojo.Book;
import cn.johnyu.jpa.converter.pojo.Car;
import cn.johnyu.jpa.converter.pojo.Customer;

public class CurdTestWithMysql {
	private static EntityManagerFactory entityManagerFactory = null;
	private EntityManager entityManager = null;

	@BeforeClass
	public static void onCreate() {
		entityManagerFactory = Persistence.createEntityManagerFactory("cn.johnyu.persistence.unit.mysql");
	}

	@AfterClass
	public static void onDestroy() {
		entityManagerFactory.close();
	}

	@Before
	public void onStart() {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@After
	public void onEnd() {
		entityManager.close();
	}

	private Customer addCustomer() {
		Customer c = new Customer();
		c.setCname("JohnYu");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
		
		return c;
	}
	
	private Book addBook() {
		Book book=new Book();
		book.setBname("Harry poltt");
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(book);
		tx.commit();
		return book;
	}

	@Test
	public void testAddCustomer() throws Exception {
		Customer c=addCustomer();
		System.out.println(c.getId());
	}
	
	@Test
	public void testAddBook() throws Exception {
		Book book=addBook();
		System.out.println(book.getId());
	}
	
	@Test
	public void testAddCar() throws Exception {
		Car c=new Car();
		c.setCarName("buck");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
		System.out.println(c.getId());
	}

	@Test
	public void testLoad() throws Exception {
		
	}

	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("cn.johnyu.persistence.unit.mysql");
	}

}
