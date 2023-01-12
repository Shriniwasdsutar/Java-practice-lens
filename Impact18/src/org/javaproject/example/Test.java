package org.javaproject.example;

public class Test {
	String string;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEID(55);
		e1.setName("Rahul");
		e1.setCity("Pune");
		e1.setSalary(1000f);
		
		Test t1 = new Test();
		System.out.println(e1.getEID());
		System.out.println(e1.getName());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println(t1.string);
		
	}

}
