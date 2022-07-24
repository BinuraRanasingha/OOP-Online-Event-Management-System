package com.media;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect 
{
	private static String url = "jdbc:mysql://localhost:3306/publicity";
	private static String userName = "root";
	private static String password = "binura";
	private static Connection c;
	
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(url,userName,password);
		}
		
		catch(Exception E)
		{
			System.out.println("Database connection failed");
		}
		return c;
	}
}
