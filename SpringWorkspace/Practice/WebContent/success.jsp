<%@page import="com.bridgelabz.servlet.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "myStyle.css">
<link href="https://fonts.googleapis.com/css?family=Mansalva&display=swap" rel="stylesheet">
</head>
<body>
	
	<div id="container">
	<table  id="fontCSS">
		<tr>
			<th colspan="4" align="center">Users List</th>
			
		</tr>
		<tr>
			<th>name</th>
			<th>mail</th>
			<th>mobile</th>
			<th>pass</th>	
		</tr>
	
	
		<%
			List<Users> userList = (List)request.getAttribute("userList");
			for(Users u : userList)
			{
		%>
			<tr>
				<td>
				<%out.println(u.getUserName()); %>
				</td>
				<td>
				<%out.println(u.getMailID());%>
				</td>
				<td>
				<%out.println(u.getMobileNumber()); %></td>
				<td>
				<%out.println(u.getPassword()); %></td>
	<%		}
	%>
	</table>
	</div>
	
</body>
</html>