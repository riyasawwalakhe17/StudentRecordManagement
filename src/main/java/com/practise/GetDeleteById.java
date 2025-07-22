package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetDeleteById {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, 1);
		session.remove(s);

		transaction.commit();
		session.close();
	}
}
