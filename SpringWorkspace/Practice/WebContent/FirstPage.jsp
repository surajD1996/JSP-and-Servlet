<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Mansalva&display=swap" rel="stylesheet">
<link rel = "stylesheet" type = "text/css" href = "myStyle.css">
</head>
<body>

	<form  action="LoginController" method="get" >
		
		<div id="container">
		    Enter user Name :<input type="text" name="userName"><br>
		    <br>
		    Enter password :<input type="password" name="password"><br>
		    <br>
		    
		        
		    <input type="submit" value="Login">
		    
		    <a href="Registration.jsp">Register</a>
		   
    	</div>
	</form>

</body>
</html>