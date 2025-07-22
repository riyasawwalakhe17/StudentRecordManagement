package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.IdentityCard;
import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class SavingData {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		IdentityCard identitycard = new IdentityCard();
		identitycard.setId(2);
		identitycard.setCardNumber("ID2214411");
		identitycard.setIssueDate("2025-07-17");
		identitycard.setExpiryDate("2029-07-30");
		
		
		Student student = new Student();
		student.setId(2);
		student.setName("shivani");
		student.setEmail("shivani@example.com");
		student.setMarks(350);
		student.setCourse("python");
		student.setIdentitycard(identitycard);
		
		session.persist(student);
		transaction.commit();
		session.close();
	}
}
