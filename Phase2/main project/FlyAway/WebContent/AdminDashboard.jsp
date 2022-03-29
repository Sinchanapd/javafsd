<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.*"%>
<%@page import="com.flyaway.AdminLogin"%>

<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3308/";
    String dbName = "flyaway";
    String userId = "root";
    String password = "root";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>

<%
    if (AdminLogin.isLoggedIn) {
%>

<h2 align="center"><b>Admin Dashboard</b></h2>
<center>
<section >
    <section >
        <section>
            <table >
                <thead>
                <tr>
                    <th scope="col">Flight ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Source</th>
                    <th scope="col">Destination</th>
                    <th scope="col">Day</th>
                    <th scope="col">Ticket Price</th>
                </tr>
                </thead>
                <tbody>
               
               
                <p align="center"><span><strong> Flight Table </strong></span></p>
                <%
                    try{
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                        statement=connection.createStatement();
                        String sql ="SELECT * FROM flight";
                        resultSet = statement.executeQuery(sql);
                        while(resultSet.next()){
                %>
                
                <tr>
                    <td><%=resultSet.getString("FlightId") %></td>
                    <td><%=resultSet.getString("Name") %></td>
                    <td><%=resultSet.getString("Source") %></td>
                    <td><%=resultSet.getString("Destination") %></td>
                    <td><%=resultSet.getString("Day") %></td>
                    <td><%=resultSet.getString("TicketPrice") %></td>
                </tr>
                
                
                <%
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        out.print("You must Login first");
                    }
                %>
                
                </tbody>
            </table>
        </section>
    </section>
</section>
</center>
<br>
<br>
<div class="row">
        <div >
            Forgot Password?<form method="post" action="${pageContext.request.contextPath}/PasswordChange.jsp">
                <button type="submit" >Change Password</button>
            </form>&ensp;
        </div>
       
        <div >
            Logout<form method="post" action="${pageContext.request.contextPath}/AdminLogin.jsp">
                <button type="submit" >Logout</button>
            </form>
        </div>
        <br>
</div>


</body>
</html>