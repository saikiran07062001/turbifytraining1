package org.infinite.test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Student;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		try {
			Student student = null;
			for (int i = 0; i <= 50; i++) {
				student = new Student();
				student.setFirstName("sai kiran" + i);
				student.setLastName("puramwar" + i);
				student.setClassName("Btecch");
				student.setRollNo("Bt/07/" + 7457 + i);
				student.setAge(27);
				session.save(student);
			}
			tx.commit();
			// Start hibernate session.
			// Insert a new student record in the database.
			// session.save(student);
			// Commit hibernate transaction if no exception occurs.
			// tx.commit();
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
