package org.infinite.pojo;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;

public class HqlSelect {

	public static void main(String[] agrs) {
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		try {
	
			Query q=session.createQuery("from Student");
			q.setMaxResults(3);
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
