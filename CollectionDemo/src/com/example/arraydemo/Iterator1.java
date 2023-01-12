package com.example.arraydemo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		List l1 = new ArrayList();
		AbstractList al1 = new ArrayList();
		ArrayList al = new ArrayList();
		
		
//		l1.add(2);
//		l1.add("Shrinivas");
//		l1.add(true);
//		l1.add(545.54f);
		
		l1.add("Shrinivas");
		l1.add("Objection");
		l1.add("Abhishek");
		l1.add("Swapnil");
		l1.add("Piyush");
		l1.add("Shivam");
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("            ");
		
		ListIterator<String> j1 = l1.listIterator();
		while(j1.hasNext()) {
			System.out.println(j1.next());
		}
		System.out.println("reverse order ");
		while(j1.hasPrevious()) {
			System.out.println(j1.previous());
		}
		}
}
