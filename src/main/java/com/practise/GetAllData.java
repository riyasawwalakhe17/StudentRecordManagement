package com.practise;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetAllData {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Student> studentList = session.createQuery("select s FROM Student s", Student.class).getResultList();

		studentList.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();
	}
}
