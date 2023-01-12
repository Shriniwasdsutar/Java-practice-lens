package org.javaproject.example;

public class Employee {
	private int eID;
	private String name;
	private String city;
	private float salary;
	
	public void setEID(int eID) {
		this.eID= eID;
	}
	
	public int getEID() {
		return this.eID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getSalary() {
		return this.salary;
	}
}
