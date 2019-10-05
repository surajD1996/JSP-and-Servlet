package com.bridgelabz.databaseoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperatoins 
{
	
	
	
	public static String url = "jdbc:mysql://localhost:3306/Demo";
	public static String userName = "root";
	public static String password = "password";
	public static Connection connection;
	public static Statement statement;
	public static ResultSet resultSet;
		
	
	public void loadDatabase()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public void connectToDatabase()
	{
		try 
		{
			connection = DriverManager.getConnection(url,userName, password);
		}
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public void displayValues()
	{
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from Student");
			while(resultSet.next())
			{
				System.out.println("ID "+resultSet.getInt(1));
				System.out.println("Name "+resultSet.getString(2));
				System.out.println("Marks "+resultSet.getString(3));
			}
		}
		
		catch (SQLException e) 
		{	
			e.printStackTrace();
		}
	}
	
	public void insertData()
	{
		String query = "insert into User(userName, userMailID, userContact, password)values(?, ?, ?, ?)";
		
	}
}
