package com.example.jdbc.example;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	final static String driver = "com.mysql.jdbc.Driver";
	final static String CONSTRING = "jdbc:mysql://localhost:3306/Demo";
	final static String User = "root";
	final static String PASSWORD_STRING = "root";
	static Connection con = null;
	
	final static String INSERT_STRING = "INSERT into tblemployee values(4, 'Shri', 2001, 'Kolhapur')";
	
	
	
	public static void main(String[] args)  {
		try {
			class.forName(driver);
			con=DriverManager.getConnnection(CONSTRING, User, PASSWORD_STRING);
			System.out.println("Connection done");
			Statement statement = con.createStatement();
			Statement.execute(INSERT_STRING);
			System.out.println("DATA INSERTED");
			
			
		}catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}catch (SQLException e) {
			System.out.println("SQL Exception");
		}finally {
			con.close();
			System.out.println("Connection Closed");
		}
		
		
	}

}
