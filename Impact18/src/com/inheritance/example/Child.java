package com.inheritance.example;

public class Child extends User{
	
	public Child() {
		this(10);

		System.out.println("Child default const");


	}
	
	public Child(int a) {

		System.out.println("paramaeterized constructor of Child");
	}
	
//
	





//	public Child() {
//		System.out.println("Child default User");
//	}
//	
//	public Child(int a) {
////		super(10);
//		this();
//		System.out.println("Child parameterised User");
//	}
}
