package com.stackdemo.example;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();	
		
		s1.push("Mahi");
		s1.push("Mahi");
		s1.push("hyd");
		s1.push("Bhugaon");
		
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Printing Data Using For loop");
		
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}
		
	}
}
