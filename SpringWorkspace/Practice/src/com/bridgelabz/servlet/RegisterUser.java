package com.bridgelabz.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String mailID = request.getParameter("mailID");
		String mobileNumber = request.getParameter("mobileNumber");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","password");
			PreparedStatement statement = connection.prepareStatement("insert into User(userName, userMailID, userContact, password)values(?, ?, ?, ?)");
			statement.setString(1, userName);
			statement.setString(2, mailID);
			statement.setString(3, mobileNumber);
			statement.setString(4, password);
			statement.executeUpdate();
			connection.close();
			response.sendRedirect("FirstPage.jsp");
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
