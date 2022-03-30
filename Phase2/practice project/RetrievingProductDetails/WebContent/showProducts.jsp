<%@page import="com.file.web.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product details</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<h3>Displaying prouduct details using product id</h3>
	
	<%
	Object strMessage = request.getAttribute("message");
	
	if( strMessage != null)  { %>
	
	<h3><% out.println(strMessage.toString()); %></h3>
	<% }%>
	
	<%
	Product p1 = (Product) request.getAttribute("product");
	
	if( p1.getName() != null && p1.getId() >= 0 )  { %>
         <div style="width: 40%; height: 100%;">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">Product ID</th>
					<th scope="col">Product Name</th>
					<th scope="col">Product Company</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">
						<%
						out.print(p1.getId());
						%>
					</th>
					<td>
						<%
						out.print(p1.getName());
						%>
					</td>
					<td>
						<%
						out.print(p1.getCompany());
						%>
					</td>

				</tr>
				<tr>
			</tbody>
		</table>

	</div>
      <% } else { %>
      
      <div>Sorry there is no product with this ID</div>
        
      <% } %>
   </body>
</html>


