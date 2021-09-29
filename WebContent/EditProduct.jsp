<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EditProduct</title>
</head>
<body>

	<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
		rs.next();//row first
	%>
	<form action="UpdateProductServlet" method="post">
		ProductName: <input type="text" name="productName"
			value="<%=rs.getString("name")%>" /><br> Price: <input
			type="text" name="price" value="<%=rs.getFloat("price")%>" /><Br>
		Qty: <input type="text" name="qty" value="<%=rs.getInt("qty")%>" /><br>
		<input type="hidden" name="productId"
			value="<%=rs.getInt("productId")%>" /> <input type="submit"
			value="Update roduct" />


	</form>
</body>
</html>