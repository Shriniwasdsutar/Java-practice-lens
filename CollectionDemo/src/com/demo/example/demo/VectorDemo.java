package com.demo.example.demo;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector<>();
		v1.add(12345);
		v1.add("Mahi");
		v1.add(true);
		v1.add(541.5f);
		v1.add(12345);
		System.out.println(v1);
		
		Iterator i1 = v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
			ListIterator l1 = v1.listIterator();
			while(l1.hasNext()) {
				System.out.println(l1.next());
			}
			System.out.println("Reverse Order");
			while(l1.hasPrevious()) {
				System.out.println(l1.previous());
			}
		
	}
}
