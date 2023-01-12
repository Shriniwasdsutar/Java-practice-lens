package com.arraylist.abhishek;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		
		ArrayList<Employee> a1= new ArrayList<>();
		Address1 addr1= new Address1("12", "vita", 415311, "maharastra", "india");
		Employee e1= new Employee(25, "Swap", "swaj", 2585245, addr1);
		Employee e2= new Employee(77, "chaitya", "chetan@123", 99760, addr1);
		e1.setId(99);
		e1.setName("vishwajeet");
		e1.setEmail("abc123@gmail.com");
		e1.setSalary(89527f);
		a1.add(e1);
		a1.add(e2);
		System.out.println(a1);
		
	}

}
