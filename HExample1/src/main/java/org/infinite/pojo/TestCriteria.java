package org.infinite.pojo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.infinite.dbutils.HibernateUtil;

public class TestCriteria {
	public static void main(String[] agrs) {
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		try {
			// Start hibernate session.
			// Insert a new student record in the database.
			// session.save();
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
			//List<Student> ls = session.createCriteria(Student.class).add(Restrictions.gt("studentId", 14)).add(Restrictions.lt("studentId", 18)).list();
			//List<Student> ls = session.createCriteria(Student.class).add(Restrictions.between("studentId", 14, 18)).list();
			Criteria crit=session.createCriteria(Student.class);
			crit.setFirstResult(14);
			crit.setMaxResults(18);
			List<Student> ls=crit.list();
			for(Student z:ls){
				System.out.println("Firstname:"+z.getFirstName()+" ");
				System.out.println("Lastname:"+z.getLastName()+" ");
				System.out.println("Rollno:"+z.getRollNo()+" ");
				System.out.println("");
			}
		} catch (HibernateException e) {
			/*
			 * if (tx != null) { // Roll back if any exception occurs.
			 * tx.rollback(); }
			 */
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}
}
