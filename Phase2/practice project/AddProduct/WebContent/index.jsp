<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3>Search for a product by ID</h3>
	<div style="width: 40%; height: 30%; margin: 20px;">
		<form class="form-inline" action="getProduct">

			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Password</label> Enter Product Id<input
					type="number" id="replyNumber" name="pid" min="0"
					data-bind="value:replyNumber" />
			</div>
			<br>
			<br>
			<button type="submit">Search</button>
		</form>

	</div>

	<!-- Show the user if the product saved successfully or not -->
	<%
		Object strMessage = request.getAttribute("message");

		if (strMessage != null) {
	%>

	<h3>
		<%
			out.println(strMessage.toString());
		%>
	</h3>
	<%
		}
	%>


	<!-- Alert the client that the id should be number not text -->
	<%
		Object idmessage = request.getAttribute("idMessage");

		if (idmessage != null) {
	%>

	<h3>
		<%
			out.println(idmessage.toString());
		%>
	</h3>
	<%
		}
	%>

	<br>
	<h3>Add a New product:</h3>
	<div style="width: 40%; height: 50%; margin: 30px;">
		<form class="form-inline" action="saveProduct">

			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Product ID</label> Enter Product ID <input
					type="number" id="replyNumber" name="sid" min="0"
					data-bind="value:replyNumber" />
			</div>
			<br>
			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Product Name</label> Enter Product Name<input
					type="text" class="form-control" name="sname">
			</div>
			<br>
			<div class="form-group mx-sm-3 mb-2">
				<label class="sr-only">Product Company</label> Enter Product Company<input
					type="text" class="form-control" name="scompany">
			</div>
			<br>
			<button type="submit">Submit</button>
		</form>

	</div>
</body>
</html>