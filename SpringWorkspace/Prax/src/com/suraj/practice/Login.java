package com.suraj.practice;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Suraj")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fName = request.getParameter("firstName"); 
		String lName = request.getParameter("lastName");
		
		List<Users> uList = new ArrayList<>();
		Users user;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}

}
