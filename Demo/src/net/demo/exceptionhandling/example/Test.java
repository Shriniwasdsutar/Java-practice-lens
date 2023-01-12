package net.demo.exceptionhandling.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	int a,b,c;
	public static void main(String[] args) {
		Test t1 = new Test();
		Scanner s1 = new Scanner(System.in);
		try{
			System.out.println("Enter 1st number");
			t1.a = s1.nextInt();
			System.out.println("Enter 2nd number");
			t1.b = s1.nextInt();
			t1.c = t1.a/t1.b;
			System.out.println("Result = "+ t1.c);
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter integer");
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero Exception");
		}
		catch (Exception e) {
			System.out.println("ERROR");
		}
		System.out.println("End of the main Method");

	}
}
