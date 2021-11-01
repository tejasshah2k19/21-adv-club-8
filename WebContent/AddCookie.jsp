<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Cookie</title>
</head>
<body>

<a href="PrintAllCookies.jsp">Print All Cookies</a>

<form action="AddCookieServlet">

	Username : <input type="text" name="userName"/><br>
	
	<input type="submit" value="Add Cookie" />
</form>

</body>
</html>