package org.infinite.pojo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;

public class HqlTest {
	public static void main(String[] agrs) {
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		try {
			Query q=session.createQuery("update Student set Last_Name=:Last_Name where Student_Id=5");
			q.setString("Last_Name", "sui");
			q.executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}
}