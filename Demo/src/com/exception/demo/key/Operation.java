package com.exception.demo.key;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
	Scanner s1 = new Scanner (System.in);
	private int id;
	private String name;
	private float salary;
	Employee e1 = new Employee();

	public void getData() {
		try {
			System.out.println("Outer try block");
			System.out.println("Enter Employee id");
			id = s1.nextInt();
			System.out.println("Enter employee name");
			name = s1.next();

			try {
				System.out.println("Inner try block");
				System.out.println("Enter Employee salary");
				salary = s1.nextFloat();
				e1.setId(id);
				e1.setName(name);
				e1.setSalary(salary);
			}catch (Exception e){
				System.out.println("Inner catch block");
				System.out.println(" ");
			}

		}catch(InputMismatchException e) {
			System.out.println("Outer catch block");
			System.out.println("Please Enter Int kind of date");
		}

	}
	
	public void Display() {
		System.out.println("Employee Id =" + e1.getId());
		System.out.println("Employee Name = " + e1.getName());
		System.out.println("Employee Salary =" + e1.getSalary());
		
	}


}
