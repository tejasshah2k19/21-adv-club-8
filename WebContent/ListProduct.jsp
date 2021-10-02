<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Products</title>
</head>
<body>


	<%
		ArrayList<ProductBean> products = (ArrayList<ProductBean>) request.getAttribute("products");
	%>

	<Table border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Action</th>
		</tr>

		<%
			for (int i = 0; i < products.size(); i++) {
		%>
		<tr>
			<td><%=products.get(i).getProductId()%></td>
			<td><%=products.get(i).getProductName()%></td>
			<td><%=products.get(i).getPrice()%></td>
			<td><%=products.get(i).getQty()%></td>
			<td><a
				href="DeleteProductServlet?productId=<%=products.get(i).getProductId()%>">Delete</a>|

				<a
				href="EditProductServlet?productId=<%=products.get(i).getProductId()%>">Edit</a></td>
		</tr>
		<%
			}
		%>




	</Table>

</body>
</html>