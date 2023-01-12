package com.example.collection;

import java.util.ArrayList;
import java.util.List;

import com.example.arraydemo.Address;
import com.example.arraydemo.Employee;

public class Client {
	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<>();
		Address a1 = new Address("102A", "Pune", 411052, "MAHARASHTRA", "INDIA");
		Employee e1 = new Employee(102, "ajay", "Ajay@gmail.com",545512,a1);
		l1.add(e1);
	System.out.println(l1);
	}

}
