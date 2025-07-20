package com.practise.Repositories;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;

import com.practise.Utility.HibernateUtility;

public class UserRepository {

	public void addData(Scanner sc) {
		Student s = new Student();
		sc.nextLine(); // to consume the leftover newline from previous nextInt()

		System.out.print("Enter id: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter student name: ");
		String name = sc.nextLine();

		System.out.print("Enter email: ");
		String email = sc.nextLine();

		System.out.print("Enter course: ");
		String course = sc.nextLine();
		
		System.out.print("Enter marks: ");
		int mark = sc.nextInt();


		sc.nextLine(); // again, consume newline

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setMarks(mark);
		s.setCourse(course);

		session.persist(s);
		transaction.commit();
		session.close();

		System.out.println("Student Details Added successfully ");
	}

	public void AllData(Scanner sc) {

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// We have to use parameterised query to filter
		List<Student> slist = session.createQuery("select s from Student s", Student.class).getResultList();

		slist.stream().forEach(a -> System.out.println(a.toString()));

		transaction.commit();
		session.close();
	}

	public void updateData(Scanner sc) {
		System.out.println("Enter Id to update marks : ");
		int id = sc.nextInt();

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, id);
		System.out.println("Enter New Marks :");
		int update = sc.nextInt();

		s.setMarks(update);

		transaction.commit();
		session.close();
		System.out.println("Student marks updated ");
	}

	public void deleteData(Scanner sc) {
		System.out.println("Enter the id to delete student details : ");
		int id = sc.nextInt();

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, id);
		session.remove(s);

		transaction.commit();
		session.close();

		System.out.println("Student details deleted ");
	}
}
