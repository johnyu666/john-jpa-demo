package org.jpa.mapping.value;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.engine.jdbc.BlobImplementer;
import org.hibernate.id.uuid.CustomVersionOneStrategy;
import org.hibernate.type.BlobType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



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
		//缓存清空
		entityManager.clear();
		return c;
	}
	
	private Customer addFullCustomer() throws Exception{
		InputStream in=new FileInputStream("favicon.ico");
		byte[] buf=new byte[in.available()];
		in.read(buf);
		
		Customer c = new Customer();
		c.setCname("JohnYu");
		c.setBirth(new Date());
		c.setSalary(345.987);
		c.setLogo(buf);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
		//缓存清空
		entityManager.clear();
		return c;
	}
	
	@Test
	public void testAddCustomer() throws Exception {
		addFullCustomer();
	}
	@Test
	public void testLoadCustomer() throws Exception {
		Customer c= addFullCustomer();
		Customer c1=entityManager.find(Customer.class, c.getId());
		
		System.out.println(c1.getCname());
		byte[] logo=c1.getLogo();
		System.out.println(logo.length);
		OutputStream out=new FileOutputStream("logo1.ico");
		out.write(logo);
		out.close();
	}
	
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("cn.johnyu.persistence.unit.mysql");
	}

}
