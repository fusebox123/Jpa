package com.cg.emsapp.menu;

import java.util.Scanner;

import com.cg.emsapp.daoimpl.EmployeeDAOImpl;
import com.cg.emsapp.domain.Employee;

public class EMSMenu {
	
	public void start() {
		int choice;
		String continueChoice;
		Scanner sc=  new Scanner(System.in);
		do {
			showMenu();		
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-------Please Provide below details---------");
				Employee employee = new Employee();
				System.out.println("Enter Employee ID");
				employee.setId(sc.nextInt());
				System.out.println("Enter Employee Name");
				employee.setName(sc.next());
				
				EmployeeDAOImpl employeeDaoImpl = new EmployeeDAOImpl();
				employeeDaoImpl.create(employee);
				System.out.println("Employee Registered Successfully!");
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				;
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : [yes/no]");
			continueChoice = sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
	}
	
	private void showMenu() {
		System.out.println("---------Employee Management System-----------");
		System.out.println("1. Create Employee");
		System.out.println("2. View All Employees");
		System.out.println("3. Remove Employee");
		System.out.println("4. Update Employee");
		System.out.println("0. Exit");
	}

}


