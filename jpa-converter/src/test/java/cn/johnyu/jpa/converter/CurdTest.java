package cn.johnyu.jpa.converter;

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

import cn.johnyu.jpa.converter.pojo.Customer;

public class CurdTest {
	private static EntityManagerFactory entityManagerFactory = null;
	private EntityManager entityManager = null;

	@BeforeClass
	public static void onCreate() {
		entityManagerFactory = Persistence.createEntityManagerFactory("cn.johnyu.persistence.unit");
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
		c.setAge("100");
//		List<String> tels = new ArrayList<String>();
//		tels.add("abc");
//		tels.add("bcd");
		
		c.getTels().add("123");
		c.getTels().add("abc");
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
		return c;
	}

	@Test
	public void testAdd() throws Exception {
		addCustomer();
	}

	@Test
	public void testLoad() throws Exception {
		Customer c = addCustomer();
		Customer c1 = entityManager.find(Customer.class, c.getId());
		System.out.println(c1.getAge());
		for (String s : c1.getTels()) {
			System.out.println("tel:" + s);
		}
	}

	public static void main(String[] args) {

	}

}
