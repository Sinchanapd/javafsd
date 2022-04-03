<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h2 style="text-align: center">Login Page</h2>

	<div style="color: red;">${error}</div>


	<form style="text-align: center" action="loginform" method='post'>
	
	<center>
	<div style="border: 2px solid black; width: 25%; border-radius: 20px; padding: 20px"; align="center";>
		<label for="username">Name:</label> <input type="text"
			id="username" placeholder="Name" name="username" required><br>
		<br> <label for="password">Password:</label> <input
			type="text" id="password" placeholder="Password"
			name="password" required><br> <br> <input
			type="submit" value="Submit">
	</div>
	</center>
	</form>
</body>
</html>