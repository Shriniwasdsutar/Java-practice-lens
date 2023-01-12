package com.demo.interfacedemo;

public interface P1 {
	public void demo();//only declaration is possible not definition
	
	default void demo3() {
		System.out.println("default interface method demo3");
	}
	
	static void demo4() {
		System.out.println("method interface demo4");
	}
}
