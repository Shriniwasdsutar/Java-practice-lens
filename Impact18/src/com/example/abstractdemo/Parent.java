package com.example.abstractdemo;

public abstract class Parent {
	public Parent() {
		System.out.println("Parent default");
	}
	
	public Parent(int a) {
		this();
		System.out.println("Parent para");
	}
}
