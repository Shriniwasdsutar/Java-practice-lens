package com.stackdemo.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList<>();
		l1.add(5463);
		l1.add(545);
		l1.add("Pune");
		l1.add("Hyd");
		l1.add("Delhi");
		System.out.println(l1);
		l1.addFirst("Demo");
		l1.addLast("Mumbai");
		System.out.println(l1);
		
		Iterator i1= l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		ListIterator l11 = l1.listIterator();
		while(l11.hasNext()) {
			System.out.println(l11.next());
	}
		System.out.println("Reverse Order");
		while(l11.hasPrevious()) {
			System.out.println(l11.previous());
		}
	
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		}
}

