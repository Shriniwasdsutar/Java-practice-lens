package com.encapsulation;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order od = new Order();
		int choice;
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("1 : Get Product Details");
			System.out.println("2 : Display Product Details");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				od.getProductDetails();
				break;
				
			case 2 :
				od.displayProductData();
				break;
			default :
				System.out.println("please Enter Valid input");
			}
			
		}

	}

}
