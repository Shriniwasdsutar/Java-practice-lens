package com.stackdemo.example;

import java.util.List;
import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		List<String> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		s1.add("Mahi");
		s1.add("Fuel");
		s1.add("Pune");
		System.out.println(s1);
		s1.remove(0);
		System.out.println(s1);
		
		s2.push(123);
		s2.push(545);
		s2.push(null);
		s2.push(88);
		s2.push(987);
		System.out.println(s2);
	}
}
