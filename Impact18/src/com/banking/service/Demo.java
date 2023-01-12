package com.banking.service;

public class Demo {
	
	{
		System.out.println("this non static block");
	}
	
	public Demo(){
		System.out.println("Constructor calling");
	}
	
	{
		System.out.println("this non static block");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
