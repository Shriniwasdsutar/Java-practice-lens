package com.example.arraydemo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int i = scanner.nextInt();
		int a[] = new int[i];
		System.out.println("Enter Array Elements");
		for(int j=0;j<a.length;j++) {
			a[j]=scanner.nextInt();
		}
		for(int k=0;k<a.length;k++) {
			System.out.println("value of arrays : "+ a[k]);
		}
	}

}
