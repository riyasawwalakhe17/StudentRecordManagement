package com.practise;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.practise.Entity.Student;
import com.practise.Repositories.UserRepository;
import com.practise.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("WELCOME TO STUDENT REPORT MANAGEMENT SYSTEM");
			System.out.println("Please Select as per Requirement");
			System.out.println("1. Add a student");
			System.out.println("2. View all students");
			System.out.println("3. Update marks by student ID");
			System.out.println("4. Delete a student");

			System.out.println("Please Enter your choice: ");
			int choice = sc.nextInt();

			UserRepository user = new UserRepository();
			switch (choice) {
			case 1:
				user.addData(sc);
				break;

			case 2:
				user.AllData(sc);
				break;

			case 3:
				user.updateData(sc);
				break;

			case 4:
				user.deleteData(sc);
				break;
			}

		}

	}
}
