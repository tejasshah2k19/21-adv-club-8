<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		String userNameError = (String) request.getAttribute("userNameError");
		String basicSalaryError = (String) request.getAttribute("basicSalaryError");
	%>
	<form action="CalculateSalaryServlet">
		Username : <input type="text" name="userName" />
		<%=userNameError == null ? "" : userNameError%>
		<Br> BasicSalary : <input type="text" name="basicSalary" />
		<%=basicSalaryError == null ? "" : basicSalaryError%>
		<br> <input type="submit" value="CalculateSalary" />

	</form>
</body>
</html>