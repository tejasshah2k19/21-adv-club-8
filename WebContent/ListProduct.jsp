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
		ResultSet rs = (ResultSet) request.getAttribute("rs");
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
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("productId")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getFloat("price")%></td>
			<td><%=rs.getInt("qty")%></td>
			<td><a
				href="DeleteProductServlet?productId=<%=rs.getInt("productId")%>">Delete</a>|

				<a href="EditProductServlet?productId=<%=rs.getInt("productId")%>">Edit</a></td>
		</tr>
		<%
			}
		%>




	</Table>

</body>
</html>