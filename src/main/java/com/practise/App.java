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
public class App 
{
    public static void main( String[] args )
    {
    	while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("WELCOME TO STUDENT REPORT MANAGEMENT SYSTEM");
			System.out.println("Please Select as per Requirement");
			System.out.println("1. Add Student Data");
			System.out.println("2. Get All Student Data");
			System.out.println("3. Get Updated Student Details");
			System.out.println("4. Get Deleted Student Details");

			System.out.println("Please Enter your choice: ");
			int choice = sc.nextInt();

			UserRepository user = new UserRepository();
			switch (choice) {
			case 1:
				System.out.println("Please Enter User ID: ");
				int stuid = sc.nextInt();
				user.addData();
				break;
				
			case 2:
				user.getAllData();
				break;
				
			case 3:
				user.getUpdatedData();
				break;
				
			case 4:
				user.getDeletedData();
				break;
			}
    	}
        
    }
}
