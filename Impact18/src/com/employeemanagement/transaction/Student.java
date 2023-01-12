package com.employeemanagement.transaction;


public class Student {
	private int id ;
	private String name;
	private String dept ;
	private String city ;
	
	public void getdata(int id, String name, String dept, String city) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(city);
	}

//	public static void main(String[] args) {
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(dept);
//		System.out.println("city");
//	}

}
