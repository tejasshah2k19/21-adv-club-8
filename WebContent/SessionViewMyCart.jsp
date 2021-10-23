<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Carts</title>
</head>
<body>

	<%
		int productId = (Integer) session.getAttribute("productId");
	%>
	<h2>My Cart</h2>

	<%
		if (productId == 1) {
			//iphone11
			out.print("Iphone11 45000");
		} else if (productId == 2) {
			//legion 540

			out.print("legion 540 55000");
		} else if (productId == 3) {
			//oven

			out.print("LG oven 35000");
		}
	%>


</body>
</html>