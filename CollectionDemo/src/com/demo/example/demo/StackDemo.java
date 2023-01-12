package com.demo.example.demo;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack s1 = new Stack<>();
		s1.push(10);
		s1.push(151.5f);
		s1.push("Fuel");
		s1.push("Pune");
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());//last element 
	}

}
