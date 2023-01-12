package com.banking.service;

public class Test {
	static{
		System.out.println("This is Static block");
	}
	
	static{
		System.out.println("This is Static block 2");
	}
	
	{
		System.out.println("This is Non-Static block");
	}
	
	
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("main method");
		Test t2 = new Test();
		
	}
}
