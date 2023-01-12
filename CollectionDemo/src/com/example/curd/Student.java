package com.example.curd;

public class Student {
	private String name;
	private String dept;
	private int rollNo;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String dept, int rollNo, Address address) {
		super();
		this.name = name;
		this.dept = dept;
		this.rollNo = rollNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", dept=" + dept + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	
	

}
