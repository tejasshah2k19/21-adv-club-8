<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
	%>


	<form action="RegistrationServlet2">
		FirstName : <input type="text" name="firstName" />
		<%=firstNameError == null ? "" : firstNameError%>
		<Br> Email : <input type="email" name="email" />
		<%=emailError == null ? "" : emailError%>
		<br> Password : <input type="password" name="password" />
		<%=passwordError == null ? "" : passwordError%>
		<br> Gender : Male<input type="radio" name="gender" value="male" />
		FeMale<input type="radio" name="gender" value="female" /><br>
		City: <select name="city">
			<option value="-1">Select City</option>
			<option value="ahm">Ahmedabad</option>
			<option value="baroda">Baroda</option>
			<option value="surat">Surat</option>
		</select> <br> Hobby: Cricket :<input type="checkbox" name="hobby"
			value="ckt" /> Swimming : :<input type="checkbox" name="hobby"
			value="swimming" /> WhatsApp :<input type="checkbox" name="hobby"
			value="wp" /> FaceBook :<input type="checkbox" name="hobby"
			value="fb" /><br> <input type="submit" value="Signup" />


	</form>

</body>
</html>