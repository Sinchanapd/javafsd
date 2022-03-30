<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Booking" %>
<%@ page import="com.model.Search" %>

<%
    Booking.passenger_name = request.getParameter("pname");
    Booking.passenger_email= request.getParameter("email");
    Booking.passenger_phone= request.getParameter("phone");

    if (Booking.passenger_name.equals("")
            || Booking.passenger_email.equals("")
            || Booking.passenger_phone.equals("")) {
        out.println("Please enter valid passenger details");
    }
    else {
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Details</title>
</head>
<body>
<center>
    <section >
        <section >
        	 <h1 align="center" ><b>Checkout</b></h1>
        	 <div style="border:2px solid black;width:50%; border-radius:20px;padding:20px"; align="center";>
             <div class="row">
                <div class="col">
                    <p align="center" ><span><strong>Enter Payment Details</strong></span></p><br>
                </div>
            </div>
           <section>
               <form action="${pageContext.request.contextPath}/ThankYou.jsp" method="post" class="form-container">
                   <div >
                       <label for="card_details">Enter UPI Id</label>
                       <input type="text" name="name_on_card" placeholder="Enter UPI Id">
                   </div>
                   <div >
                       <label for="card_details">Enter Card Number</label>
                       <input type="number" name="card_details" placeholder="Enter Card Number">
                   </div>
                   <br>
                   <p align="left"><span><strong>Total Amount<br> <%=Booking.ticket_price%> X <%=Search.persons%> persons = Rs.<%=Booking.ticket_price*Search.persons%></strong></span></p>
                   <button type="submit" value="Submit">Pay Through UPI</button>
               </form>
          </section>
          </div>
        </section>
    </section>
  
</center>
</body>
</html>
<%
    }
%>
