package com.stackdemo.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		
		
		l1.add("pravin");
		l1.add("Shubham");
		l1.add("Mahi");
		l1.add("Joe");
		l1.add("Bob");
		l1.add("John");
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}

}
