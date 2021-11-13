<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL core Tag</title>
</head>
<body>


	<%
		int a = 90;
	%>

	<%=a%>
	<br>

	<c:set var="b" value="901"></c:set>
	<c:out value="${b}"></c:out>




	<br>

	<%
		if (a % 2 == 0) {
			out.print("number is even");
		} else {
			out.print("number is odd");
		}
	%>
	<c:if test="${b%2 == 0 }">
		number is even
	</c:if>

	<c:if test="${b%2 != 0 }">
		number is odd
	</c:if>
	
	
	
	
	<br>
	
	<c:set value="21" var="choice"></c:set>
	<c:choose>
		<c:when test="${choice == 1 }">
			choice 1
		</c:when>	
	
		<c:when test="${choice == 2 }">
			choice 2
		</c:when>	
	
		<c:when test="${choice == 3 }">
			choice 3
		</c:when>	
	
		<c:otherwise>
			Default choice	
		</c:otherwise>
	</c:choose>















</body>
</html>