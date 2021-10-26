<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
		Welcome.... <br> <a href="SessionPrintInfo.jsp">PrintInfo</a> | <a
			href="SessionViewMyCart.jsp">My Cart</a>| 
			
			<a href="SessionLogoutServlet">Logout</a> <br> <br> <br>
		<br>

		<div class="row">
			<div class="col-md-4">
				<span style="border: 1px"> <img
					src="assets/images/iphone11.png" height="200" width="200" /> <br>
					iphone11 <br> 45000 <br> <a
					href="SessionAddToCartServlet?productId=1">AddToCart</a>
				</span>

			</div>

			<div class="col-md-4">
				<span style="border: 1px"> <img
					src="assets/images/legiony540.jpg" height="200" width="200" /> <br>
					Legion 540 <br> 55000 <br> <a
					href="SessionAddToCartServlet?productId=2">AddToCart</a>
				</span>

			</div>

			<div class="col-md-4">
				<span style="border: 1px"> <img
					src="assets/images/microwave oven.jpg" height="200" width="200" />
					<br> LG Oven <br>35000 <br> <a
					href="SessionAddToCartServlet?productId=3">AddToCart</a>
				</span>

			</div>

		</div>

	</div>
</body>
</html>