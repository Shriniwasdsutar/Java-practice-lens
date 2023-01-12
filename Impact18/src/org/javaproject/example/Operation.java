package org.javaproject.example;

import java.util.Scanner;

public class Operation {
	
	private int bookID;
	private String bookName;
	private String author;
	private float price;
	
	Books b1 = new Books();
	
	public void bookData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Book ID");
		bookID = scanner.nextInt();
		
		System.out.println("Enter Bookname");
		bookName = scanner.next();
		
		System.out.println("Enter Author");
		author = scanner.next();
		
		System.out.println("Enter Book Price");
		price = scanner.nextFloat();
		
		b1.setBookID(bookID);
		b1.setbookName(bookName);
		b1.setAuthor(author);
		b1.setPrice(price);
		
	}
	
	public void displayData() {
		System.out.println(b1.getBookID());
		System.out.println(b1.getbookName());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
	}
	
	

}
