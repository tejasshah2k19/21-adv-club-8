<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print All Request Headers</title>
</head>
<body>
	<h2>Request Headers</h2>

	<%
		Enumeration<String> allHeaders = request.getHeaderNames();// return all the header names in enumeration format
	%>


	<%
		// 1 2 3 4 5  false 
		while (allHeaders.hasMoreElements()) { //true 
			String headerName = allHeaders.nextElement(); //1 2 3 4 5 
			out.print(headerName + " ==> " + request.getHeader(headerName) + "<br>");
		}
	%>

</body>
</html>