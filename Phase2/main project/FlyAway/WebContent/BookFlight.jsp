<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.model.Booking" %>
<%
    Booking.flight_booking_id = request.getParameter("flight_id");
    Booking.ticket_price = Integer.parseInt(request.getParameter("ticket_price"));
    Booking.flight_name = request.getParameter("name");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Details</title>
</head>
<body>
<center>
<section >
        <section >
        	 <h1 align="center" ><b>Booking Details</b></h1>
        	 <div style="border:2px solid black;width:25%; border-radius:20px;padding:20px"; align="center";>
            <div class="row">
                <div class="col">
                    <p align="center"><span><strong>Enter Passenger Details</strong></span></p><br>
                </div>
            </div>
            <center>
            <section >
                <form action="${pageContext.request.contextPath}/Payment.jsp" method="post" class="form-container">
                    <div >
                        <label for="pname">Passenger Name</label>
                        Name of Passenger<input type="text" name="pname" placeholder="Name of Passenger">
                    </div>
                    <div >
                        <label for="email">Email address</label>
                        Enter email<input type="email" name="email"  aria-describedby="emailHelp" placeholder="Enter email">
                    </div>
                    <div >
                        <label for="phone">Phone</label>
                       Enter phone number<input type="number"  name="phone" placeholder="Enter phone number">
                    </div>
                    <br>
                    <button type="submit" value="Submit">Submit</button>
                </form>
            </section>
            </center>
            </div>
        </section>
    </section>
	
</body>
</html>