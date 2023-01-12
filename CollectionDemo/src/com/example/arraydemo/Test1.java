package com.example.arraydemo;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Employee> aList = new ArrayList<>();
		
		Address a2 = new Address("101A","Hyd",511038,"TS","India");
		Employee e1 = new Employee(101, "mahi", "mahi@gmail.com", 54566, a2);
//		Employee e2 = new Employee(102, "Guru", "Guru@gmail.com", 2134.451f);
//		Employee e3 = new Employee(103, "Sham", "sham@gmail.com", 2134.451f);

		
		e1.setId(101);
		e1.setName("Mahi");
		e1.setEmail("Mahi@gmail.com");
		e1.setSalary(542612);
		aList.add(e1);
//		aList.add(e2);
//		aList.add(e3);
		
		System.out.println(aList);
	}

}
