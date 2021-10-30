<%@page import="java.util.ArrayList"%>
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
		//int productId = (Integer) session.getAttribute("productId");
	%>

	<%
		/*
			if (productId == 1) {
				//iphone11
				out.print("Iphone11 45000");
			} else if (productId == 2) {
				//legion 540
		
				out.print("legion 540 55000");
			} else if (productId == 3) {
				//oven
		
				out.print("LG oven 35000");
			}*/
	%>


	<h2>My Cart</h2>
	<br>
	<a href="SessionHome.jsp">Home</a>
	<br>
	<br>
	<%
		ArrayList<Integer> cart = (ArrayList<Integer>) session.getAttribute("cart");
	%>


	<%
		if (cart.size() == 0) {
			out.print("Cart is Empty");

		} else {
			int iphone = 0;
			int oven = 0;
			int legion = 0;
			for (Integer productId : cart) {
				if (productId == 1) {
					iphone++;
				} else if (productId == 2) { //legion 540 out.print("legion 540 55000"); 
					legion++;
				} else if (productId == 3) { //oven out.print("LG oven 35000");
					oven++;
				}
			}
	%>

	<table border="1">
		<tr>
			<th>ProductName</th>
			<th>Qty</th>
			<th>Price</th>
			<th>TotalPrice</th>
			<th>Action</th>
		</tr>

		<%
			if (iphone != 0) {
					out.print("<tr><td>Iphone 11 </td><td>" + iphone + "</td><td>45000</td><td>" + (45000 * iphone)
							+ "</td><td><a href='SessionCartQtyServlet?productId=1'>Qty--</a></td></tr>");
				}

				if (legion != 0) {
					out.print("<tr><td>Legion 540 </td><td> " + legion + "</td><td>55000</td><td>" + (55000 * legion)
							+ "</td><td><a href='SessionCartQtyServlet?productId=2'>Qty--</a></td></tr>");
				}
				if (oven != 0) {
					out.print("<tr><td>Oven</td><td>" + oven + "</td><td>35000</td><td> " + (35000 * oven)
							+ "</td><td><a href='SessionCartQtyServlet?productId=3'>Qty--</a></td></tr>");
				}
			}
		%>

	</table>
















</body>
</html>