package com.example.curd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class GetDetails implements Display, Accept {
	private String name;
	private String dept;
	private int rollNo;
	private Address address;
	
	private  String city;
	private int flatNo;
	private int laneNo;
	private String state;
	private String country;
	
	Student s1 = new Student();
	Address a1 = new Address();
	
	
	List<Student> s11 = new Stack();
	
	
	@Override	
	public void displayData() {
//		List l1 = s11.iterator();
//		System.out.println("Hey");
//		while(l1.hasNext()) {
//			System.out.println(l1.next());
		System.out.println(s11);

		}
		
		
		
	

	@Override
	public void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		rollNo = scanner.nextInt();
		System.out.println("Enter Name :");
		name = scanner.next();
		System.out.println("Enter Department :");
		dept = scanner.next();
		System.out.println("Enter Complete Student Address : ");
		System.out.println("FLat No:");
		flatNo =scanner.nextInt();
		System.out.println("Lane no :");
		laneNo = scanner.nextInt();
		System.out.println("Enter City : ");
		city = scanner.next();
		System.out.println("Enter State : ");
		state = scanner.next();
		System.out.println("Enter Country : ");
		country = scanner.next();
		
		s1.setRollNo(rollNo);
		s1.setName(name);
		s1.setDept(dept);
		
		a1.setFlatNo(flatNo);
		a1.setCity(city);
		a1.setLaneNo(laneNo);
		a1.setState(state);
		a1.setCountry(country);
		
		s1.setAddress(a1);
		
		s11.add(s1);
	}
}
