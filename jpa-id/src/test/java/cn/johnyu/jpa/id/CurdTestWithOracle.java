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
import cn.johnyu.jpa.converter.pojo.Customer;
import cn.johnyu.jpa.converter.pojo.Item;

public class CurdTestWithOracle {
	private static EntityManagerFactory entityManagerFactory = null;
	private EntityManager entityManager = null;

	@BeforeClass
	public static void onCreate() {
		entityManagerFactory = Persistence.createEntityManagerFactory("cn.johnyu.persistence.unit.oracle");
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

	private Item addItem() {
		Item item=new Item();
		item.setItemName("item1");
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(item);
		tx.commit();
		return item;
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
	public void testAddItem() throws Exception {
		Item item=addItem();
		System.out.println(item.getId());
	}
	
	@Test
	public void testAddBook() throws Exception {
		Book book=addBook();
		System.out.println(book.getId());
	}

	@Test
	public void testLoad() throws Exception {
		
	}

	public static void main(String[] args) {

	}

}
