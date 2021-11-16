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
		String cityValue = (String) request.getAttribute("cityValue");
		String hobbyValue = (String) request.getAttribute("hobbyValue");

		
			
	%>


	<form action="RegistrationServlet2">
		FirstName : <input type="text" name="firstName"
			value="${firstNameValue }" /> ${firstNameError} <Br> Email : <input
			type="text" name="email" value="${emailValue }" /> ${emailError} <br>
		Password : <input type="password" name="password" /> ${passwordError }
		<br> Gender : Male<input type="radio" name="gender"
			checked="checked" value="male" /> FeMale<input type="radio"
			name="gender" value="female" /><br> City: <select name="city">
			<option value="-1">Select City</option>
			<option value="ahm"
				<%=cityValue != null && cityValue.equals("ahm") ? "selected" : ""%>>Ahmedabad</option>
			<option value="baroda"
				<%=cityValue != null && cityValue.equals("baroda") ? "selected" : ""%>>Baroda</option>
			<option value="surat"
				<%=cityValue != null && cityValue.equals("surat") ? "selected" : ""%>>Surat</option>
		</select> ${cityError } <br> Hobby: Cricket :<input type="checkbox"
			name="hobby" value="ckt"
			<%=hobbyValue != null && hobbyValue.contains("ckt") ? "checked" : ""%> />
		Swimming : :<input type="checkbox" name="hobby" value="swimming"
			<%=hobbyValue != null && hobbyValue.contains("swimming") ? "checked" : ""%> />
		WhatsApp :<input type="checkbox" name="hobby" value="wp"
			<%=hobbyValue != null && hobbyValue.contains("wp") ? "checked" : ""%> />
		FaceBook :<input type="checkbox" name="hobby" value="fb"
			<%=hobbyValue != null && hobbyValue.contains("fb") ? "checked" : ""%> />


		${hobbyError} <br> <input type="submit" value="Signup" />


	</form>

</body>
</html>