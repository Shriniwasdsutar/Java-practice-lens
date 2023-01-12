
package net.demo.exceptionhandling.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Client {
	public static void main(String[] args) throws IOException {
		int a[] = {20,50,30,80};
		File f1 = new File("/home/shrinivas/Desktop/nani.txt");
		FileInputStream fileInputStream = new FileInputStream(f1);
		try {
			fileInputStream.read();
			System.out.println("file open");
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
			fileInputStream.close();
			System.out.println("file close");
		}
	}
}
