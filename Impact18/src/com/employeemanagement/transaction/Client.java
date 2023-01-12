package com.employeemanagement.transaction;

public class Client {
	public static void main(String[] args) {
//		int a=10;
//		int b;
//		b= a;
//		float c;
//		c=a;
//
//		float f = 102.5f;
//		int x;
//		x = (int)f;
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(x);
		Student s1 = new Student();
		s1.getdata(101, "Rajiv", "CSE", "Pune");
		s1.display();
	}
}
