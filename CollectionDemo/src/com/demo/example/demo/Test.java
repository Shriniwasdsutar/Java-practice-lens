package com.demo.example.demo;

import java.util.Iterator;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		Vector<Student> s = new Vector<>();
		Student s1 = new Student(1, "Sam", "Pune", "Sam@gmail.com", "Computer");
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Piyush");
		s2.setCity("Jalgaon");
		s2.setEmail("Pi@gmail.com");
		s2.setDept("IT");
		
		s.add(s2);
		s.add(0, s1);
		
		Iterator<Student> i1 = s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("after deleting data");
		s.remove(0);
		System.out.println(s);
		System.out.println(s.capacity());
	}

}
