package com.example.demo;

import java.util.HashSet;

public class Demo1 {
	public static void main(String[] args) {
		HashSet h1 = new HashSet<>();
		h1.add(15);
		h1.add(2456);
		h1.add(899);
		h1.add(878);
		System.out.println(h1);
		h1.remove(15);
		System.out.println(h1);
		HashSet<String> h2 = new HashSet<>();
		h2.add("Kilo");
		h2.add("Byte");
		System.out.println(h2);
		
		
	}

}
