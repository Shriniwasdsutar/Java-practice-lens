package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(300)
public class TestDemo{
	@Test
	public void demo1() {
		String str = "Fuel";
		String str1 = "Fuel";
		assertEquals(str, str1);
		System.out.println("Success");
	}
	
	@Test
	public void demo2() {
		String str = "Fuel";
		String str1 = "Fuel";
		assertEquals(str, str1);
		System.out.println("Success Test Case");
	}
}