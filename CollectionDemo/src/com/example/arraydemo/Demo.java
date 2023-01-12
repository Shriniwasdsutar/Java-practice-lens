package com.example.arraydemo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		List l1 = new ArrayList();
		AbstractList al1 = new ArrayList();
		ArrayList al = new ArrayList();
		
		c1.add(2);
		c1.add("Shrinivas");
		c1.add(true);
		c1.add(545.54f);
		l1.add(2);
		l1.add("Shrinivas");
		l1.add(true);
		l1.add(545.54f);
		al1.add(2);
		al1.add("Shrinivas");
		al1.add(true);
		al1.add(545.54f);
		al.add(2);
		al.add("Shrinivas");
		al.add(true);
		al.add(545.54f);
		System.out.println(c1);
		System.out.println(al1);
		System.out.println(l1);
		System.out.println(al);
		
		al.remove(true);

		al.remove(2);

		System.out.println(al);


	}

}
