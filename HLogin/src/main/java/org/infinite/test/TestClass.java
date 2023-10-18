package org.infinite.test;


import java.util.Date;
import java.sql.Timestamp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Login;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		Login details = new Login();
		details.setUsername("sai kiran");
		details.setPassword("sai@123");
		details.setTime(now);
		/*student.setLastName("S");
		student.setClassName("Btecch");
		student.setRollNo("Bt/07/7456");
		student.setAge(27);*/
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new student record in the database.
			session.save(details);
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
			session.close();
		}
	}
}

