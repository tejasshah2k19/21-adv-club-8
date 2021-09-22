<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
		rs.next(); //1st record 
		int studentId = rs.getInt("studentId");
		String firstName = rs.getString("firstName");
		String email = rs.getString("email");
		String password = rs.getString("password");
	
	%>
	<h2>View Students</h2>

			<b>StudentId</b> :<%=studentId%><br>
			<b>FirstName</b> :<%=firstName%><br>
			<b>Email</b> :<%=email%><bR>
			<b>Password</b> :<%=password%><br>
	<a href="ListStudentsServlet">Back</a>
 			
 





</body>
</html>