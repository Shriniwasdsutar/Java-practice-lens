package com.arraylist.abhishek;
import java.util.ArrayList;
import java.util.List;

import com.senerios.inheritance.*;
public class Client {
public static void main(String[] args) {
	List<Employee> l1= new ArrayList<>();
	Address1 addr1=new Address1("134", "vita", 43663, "maha", "ind");
	Employee e1= new Employee(121, "jay", "jay@123", 478259, addr1);
	l1.add(e1);
	System.out.println(l1);
}
}
