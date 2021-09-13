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
	%>
	<h2>List All Students</h2>

	<%
		while (rs.next()) {
			int studentId = rs.getInt("studentId");
			String firstName = rs.getString("firstName");
			String email = rs.getString("email");
			String password = rs.getString("password");
			out.print(studentId + "\t" + firstName + "\t" + email + "\t" + password+"<br>");
		}
	%>




</body>
</html>