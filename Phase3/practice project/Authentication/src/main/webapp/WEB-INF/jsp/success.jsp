<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>

	<form style="text-align: center; margin-left: auto; margin-right: auto"
		action="loginform" method="get">
		<label for="username"></label> <input type="hidden" name="username">
		<br> <br> <label for="password"></label> <input
			type="hidden" name="password"> <br> <br>
	</form>
	<h2 style="text-align: center">Login Successful</h2>
	<center>
	<a style="text-align: center" href="loginform">Login again</a>
	</center>

	<br>
</body>
</html>