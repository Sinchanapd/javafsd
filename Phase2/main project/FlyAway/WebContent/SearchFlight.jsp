<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
<center>
	<div>
        <b>Welcome to FlyAway Ticket Booking </b><br>
    </div>
	<div style="border:2px solid black;width:25%; border-radius:20px;padding:20px"; align="center";>
    
   <form action="SearchFlight" method="post">
        <div align="left">
          <label for="date">Date</label>
          <input type="date"   id="date" name="date" placeholder="yyyy-mm-dd..">
        </div>
        <br>
        <div align="left">
          <label for="source">Source</label>
                    <select  id="source" name="source">
                        <option value="Delhi">Delhi</option>
                        <option value="Bangalore">Bangalore</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="London">London</option>
                        <option value="kolkata">kolkata</option>
                        <option value="Dubai">Dubai</option>
                        <option value="New York">New York</option>
                        <option value="Muscat">Muscat</option>
                        <option value="Jakarta">Jakarta</option>
                        <option value="Chennai">Chennai</option>
                    </select>
        </div>
        <br>
        
        <div align="left">
        
           <label for="destination">Destination</label>
                    <select  id="destination" name="destination">
                        <option value="Delhi">Delhi</option>
                        <option value="Bangalore">Bangalore</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="London">London</option>
                        <option value="kolkata">kolkata</option>
                        <option value="Dubai">Dubai</option>
                        <option value="New York">New York</option>
                        <option value="Muscat">Muscat</option>
                        <option value="Jakarta">Jakarta</option>
                        <option value="Chennai">Chennai</option>   
                    </select>
        </div>
        <br>
        <div align="left">
          <label for="persons">No of Persons</label>
                    <select id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
        </div>
        <br>
         <button type="submit"  value="Submit">Search Flights</button>   
    </form>
    </div>
</center>
</body>
</html>