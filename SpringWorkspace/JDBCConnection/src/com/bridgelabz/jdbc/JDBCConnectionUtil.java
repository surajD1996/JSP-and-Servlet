package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCConnectionUtil 
{
	public static String url = "jdbc:mysql://localhost:3306/Demo";
	public static String userName = "root";
	public static String password = "password";
	public static Connection connection;
	public static Statement statement;
	public static ResultSet resultSet; 
	
	static public boolean connectToDatabase()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,userName, password);
			return true;
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static void displayValues() throws SQLException, ClassNotFoundException
	{
//		Class.forName("com.mysql.jdbc.Driver");
//		connection = DriverManager.getConnection(url,userName, password);
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Student");
		
		while(resultSet.next())
		{
			System.out.println("ID "+resultSet.getInt(1));
			System.out.println("Name "+resultSet.getString(2));
			System.out.println("Marks "+resultSet.getString(3));
		}
		
	}
	
	public static boolean insertValues()
	{
		String query = "insert into Student(idStudent, Name, marks) values(?, ?, ?)";
		//String query = "";
		
		try 
		{
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection(url,userName, password);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,4);
			preparedStatement.setString(2,"Ganada B");
			preparedStatement.setInt(3,99);
			preparedStatement.executeUpdate();
			
			preparedStatement.setInt(1,5);
			preparedStatement.setString(2,"Khadake S");
			preparedStatement.setInt(3,101);
			preparedStatement.executeUpdate();
			
			preparedStatement.setInt(1,6);
			preparedStatement.setString(2,"Akshay B");
			preparedStatement.setInt(3,98);
			preparedStatement.executeUpdate();
			
			
			return true;
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}











