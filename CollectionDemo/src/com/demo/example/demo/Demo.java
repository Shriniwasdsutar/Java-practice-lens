package com.demo.example.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Set s1 = new TreeSet();
		s1.add("Mahi");
		s1.add("pune");
		s1.add("Mumbai");
		s1.add("hyd");
		s1.add("pune");
		s1.add("mahi");
		System.out.println(s1.contains("mahi"));
		System.out.println(s1);

		
		TreeSet t1 = new TreeSet();
		t1.add(102);
		t1.add(101);
		t1.add(105);
		t1.add(103);
		t1.add(104);
		t1.add(103);
		System.out.println(t1);
		
		Iterator  i1 = t1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}System.out.println(t1.descendingSet());
	}

}
