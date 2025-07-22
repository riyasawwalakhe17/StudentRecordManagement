package com.practise;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetStudentByID {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		int id = 1;
		Student student = session.find(Student.class, 8);
		
		transaction.commit();
		session.close();
		System.out.println("DATA for student with id " + id + " : " + student.toString());
	}
}
