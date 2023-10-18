package com.infinite.testmain;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.infinite.pojo.Product;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setPname("karshima 35");
		p.setPrice(215000);
		Transaction tx = null;
		// Get the session object.
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new student record in the database.
			session.save(p);
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			factory.close();
			session.close();
		}
	}

}
