package com.demo.example;

import java.util.List;
import java.util.ListIterator;

public class Employee {
	private e1 = new Employee(1,"mahajan","Hyd",123450);
	private e2 = new Employee(2,"Joe","Pune",56489);
	private e3 = new Employee(3,"Bob","Pune",54851);
	
	List<Employee> l1 = new ArrayList<>();
	l1.add(e1);
	l1.add(e2);
	l1.add(e3);
	
	ListIterator<Employee> i1 = l1.listIterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	while(i1.hasPrevious()) {
		System.out.println(i1.previous());
	}




}
