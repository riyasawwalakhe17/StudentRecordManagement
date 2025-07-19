package com.practise.Repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;

import com.practise.Utility.HibernateUtility;

public class UserRepository {

	public void addData() {
		// 1.Add a Student
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = new Student();
		s.setId(8);
		s.setName("Sakshi Bondre");
		s.setEmail("sakshi@example.com");
		s.setCourse("Java Developer");
		s.setMarks(220);

		session.persist(s);
		transaction.commit();
		session.close();
	}
	
	public void getAllData() {
		// 2. Get All Student Details
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Student> slist = session.createQuery("select s from Student s", Student.class).getResultList();
		System.out.println("List of Student Details:");
		slist.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();
	}
	
	public void getUpdatedData() {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Updated User Details:");
		Student s = session.find(Student.class, 4);
		s.setCourse("Data Structure");

		transaction.commit();
		session.close();
	}
	public void getDeletedData() {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Deleted Student Details:");
		Student s = session.find(Student.class, 8);
		session.remove(s);

		transaction.commit();

		session.close();
	}
}
