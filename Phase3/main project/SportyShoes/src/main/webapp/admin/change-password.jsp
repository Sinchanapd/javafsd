<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - Change Password</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body style="background-color: #D1FFE8;">
<jsp:include page="/components/header1.jsp" ></jsp:include>
<jsp:include page="/components/admin-header.jsp" ></jsp:include>
<jsp:include page="/components/admin-topbar.jsp" ></jsp:include>


<form name=frmPwd method=post action="adminchangepwdaction">
 <div class="container">
 <p class=" ">${error }</p>
<table class="table table-light" style="border:2px solid black;">
  <tbody>
    <tr>
      <td scope="col">Enter new password*</td>
      <td><input name=pwd maxlength=10 type="password"></td>
    </tr>
    <tr>
      <td width=25%>Confirm new Password*</td>
      <td>
 	  <input name=pwd2 maxlength=10 type="password">
 	  </td>
    </tr>
  </tbody>
</table>
	<div class="text-center mx-3 my-3">
 		<p style="">
 			<button class="btn btn-success">Login</button>
 		</p>
 	</div>
</div>
</form>

<jsp:include page="/components/admin-footer.jsp"></jsp:include>
</body>
</html>