package com.exception.demo.key;

import java.util.jar.Attributes.Name;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	public Employee() {
		super();
		
	}
	
	
	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	
}
