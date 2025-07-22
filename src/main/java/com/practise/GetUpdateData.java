package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetUpdateData {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, 2);
		s.setName("harshal");
		s.setEmail("harshal@example.com");
		s.setCourse("AI");
		s.setMarks(230);

		/*
		 * Here We need to get document first and then set it so it will change value in
		 */

		s.getIdentitycard().setCardNumber("ID356663");
		s.getIdentitycard().setIssueDate("2025-07-12");
		s.getIdentitycard().setExpiryDate("2027-08-01");

		transaction.commit();
		session.close();
	}
}
