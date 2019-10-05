package com.bridgelabz.jdbc;

import java.sql.SQLException;

public class Demo 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		if(JDBCConnectionUtil.connectToDatabase())
		{
			System.out.println("Connected");
		}
		JDBCConnectionUtil.displayValues();
		
		if(JDBCConnectionUtil.insertValues())
		{
			System.out.println("Data Inserted");
		}
		
		JDBCConnectionUtil.displayValues();
		
	}
	
}
