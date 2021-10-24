<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver's License</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
   <nav class="navbar navbar-expand-lg bg-dark navbar-dark py-1 fixed-top">
       <div class="container">
         <a class="navbar-brand">Driver's License Practice Assignment</a>
    
          </div>
   </nav>
	<section class="py-5"></section>	


<section>
	<div class="container">
		<div class="col-lg-6 offset-lg-3">
			<h1><c:out value="${person.firstName}  ${person.lastName}"/></h1>
			<p>License Number: <c:out value="${person.license.number}"/></p>
			<p>State: <c:out value="${person.license.state}"/></p>
			<p>Expiration Date: <c:out value="${person.license.expirationDate}"/></p>
		</div>
	</div>
</section>  



</body>
</html>