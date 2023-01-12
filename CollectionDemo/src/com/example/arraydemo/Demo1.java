package com.example.arraydemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> aL = new ArrayList();
		ArrayList<Integer> al1 = new ArrayList<>();
		
		aL.add("Fuel");
		aL.add("Pune");
		aL.add("Hyd");
		aL.add("Pune");
		aL.add(null);
		Iterator i1 = aL.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Reverse order");

		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
//		System.out.println(aL);
		
//		al1.add(542);
//		al1.add(10);
//		al1.add(null);
//		System.out.println(al1);
	}

}
