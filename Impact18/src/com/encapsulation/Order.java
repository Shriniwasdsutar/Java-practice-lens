package com.encapsulation;

import java.util.Scanner;

public class Order {
	
	private int productID;
	private String productType;
	private String productName;
	private float productPrice;
	private String desc;
	
	Product p1 = new Product();
	
	public void getProductDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		productID = sc.nextInt();
		System.out.println("Enter Product Type");
		productType = sc.next();
		System.out.println("Enter Product Name");
		productName = sc.next();
		System.out.println("Enter Product Price");
		productPrice = sc.nextFloat();
		System.out.println("Enter Product Description");
		desc = sc.next();
		
		p1.setProductID(productID);
		p1.setProductType(productType);
		p1.setProductName(productName);
		p1.setProductPrice(productPrice);
		p1.setDesc(desc);
		
		
	}
	
	public void displayProductData() {
		System.out.println(p1.getProductID());
		System.out.println(p1.getProductType());
		System.out.println(p1.getProductName());
		System.out.println(p1.getProductPrice());
		System.out.println(p1.getDesc());
	}
}
