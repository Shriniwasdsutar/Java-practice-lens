package com.arraylist.abhishek;

public class Employee {
private int id;
private String name;
private String email;
private float salary;
private Address1 address;



public Employee(int id, String name, String email, float salary, Address1 address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.salary = salary;
	this.address = address;
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




public void setName(String name) {
	this.name = name;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public float getSalary() {
	return salary;
}




public void setSalary(float salary) {
	this.salary = salary;
}




public Address1 getAddress() {
	return address;
}




public void setAddress(Address1 address) {
	this.address = address;
}




@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address=" + address
			+ "]";
}







		
			
}

