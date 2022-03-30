<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<center>
	<b>Welcome to FlyAway User Login</b>
	<div style="border: 2px solid black; width: 25%; border-radius: 20px; padding: 20px"; align="center";>
		<form action="UserLogin" method="post">
			Name <input name="name" type="text"><br><br> 
			Email <input name="email" type="text"><br><br>
			<button type="submit" value="Submit">LogIn</button>
		</form>
	</div>
	</center>
</body>
</html>