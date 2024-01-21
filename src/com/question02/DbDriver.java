package com.question02;

import java.util.Scanner;

public class DbDriver {

	public static void main(String[] args) {

		//Creating an object for the service class
		DBOperationsService dbo = new DBOperationsService("jdbc:mysql://localhost:3306/GL", "root", "Mani@2000");

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while(choice != 6)
		{
			System.out.println("Enter 1 to add Employee");
			System.out.println("Enter 2 to view all employee ");
			System.out.println("Enter 3 to update name and mobile of employee");
			System.out.println("Enter 4 to delete specific employee");
			System.out.println("Enter 5 to delete all employee");
			System.out.println("Enter 6 to exit");
			System.out.print("Enter your choice from above : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
			{
				dbo.addEmployee();
				break;
			}
			case 2 :
			{
				dbo.displayAll();
				break;
			}
			case 3 :
			{
				dbo.updateNameMobile();
				break;
			}
			case 4 :
			{
				dbo.deleteSpecific();
				break;
			}
			case 5 :
			{
				dbo.deleteAll();
				break;
			}
			case 6 :
			{
				break;
			}
			default :
			{
				System.err.println("Invalid choice please try again!!!!!");
			}
			}
		}
		sc.close();

	}

}
