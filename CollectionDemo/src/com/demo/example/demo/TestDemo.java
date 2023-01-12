package com.demo.example.demo;

import java.util.TreeSet;

public class TestDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<>();
		
		
		t1.add(12345);
		t1.add(555);
		t1.add(12345);
		t1.add(111);
		t1.add(99);
		t1.add(222);
		
		System.out.println(t1);
		System.out.println(t1.first());
		System.out.println(t1.last());
		t1.pollFirst();
		System.out.println(t1);
		t1.pollLast();
		System.out.println(t1);
	}

}
