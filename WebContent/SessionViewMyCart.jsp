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

	<%
		ArrayList<Integer> cart = (ArrayList<Integer>) session.getAttribute("cart");
	%>


	<%
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

		if (iphone != 0) {
			out.print("Iphone 11 &nbsp;&nbsp;&nbsp;&nbsp;" + iphone + " &nbsp;&nbsp;45000&nbsp;&nbsp; " + (45000 * iphone) + "<br>");
		}

		if (legion != 0) {
			out.print("Legion 540 &nbsp;&nbsp;&nbsp;&nbsp;   " + legion + "&nbsp;&nbsp; 55000 &nbsp;&nbsp;" + (55000 * legion) + "<br>");
		}

		if (oven != 0) {
			out.print("Oven &nbsp;&nbsp;&nbsp;&nbsp;" + oven + " &nbsp;&nbsp;35000&nbsp;&nbsp; " + (35000 * oven) + "<br>");
		}
	%>











</body>
</html>