<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6">

				<h2>Signup</h2>
				<form action="SignupServlet2">
					<div class="form-group">
						<label for="email">FirstName:</label> <input type="text"
							class="form-control" id="email" placeholder="Enter firstname"
							name="firstName"> ${firstNameError }
					</div>

					<div class="form-group">
						<label for="email">Email:</label> <input type="text"
							class="form-control" id="email" placeholder="Enter email"
							name="email">${emailError }
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" id="pwd" placeholder="Enter password"
							name="pswd">${passwordError }
					</div>
					<div class="form-group form-check">
						<label class="form-check-label"> <input
							class="form-check-input" type="checkbox" name="remember">
							Remember me
						</label>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<br>
				<p>
					<a href="Login.html">Login</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>