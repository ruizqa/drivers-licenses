<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/styles.css"/>
</head>
<body>
   <nav class="navbar navbar-expand-lg bg-dark navbar-dark py-1 fixed-top">
       <div class="container">
         <a class="navbar-brand"> Assignment</a>
       </div>
   </nav>
	<section class="py-5"></section>	
	<section>
		<div class="container">
		<div class="col-lg-6 offset-lg-3">
			<h1>All People</h1>
			<table class="table table-striped table-hover">
			    <thead class="table-dark">
			        <tr>
			            <th>Name</th>
			            <th>License Number</th>
			            <th>State</th>
			            <th>Expiration Date</th>
			        </tr>
			    </thead>
			    <tbody>
			        <c:forEach items="${persons}" var="person">
			        <tr>
			            <td><a href="/persons/${person.id}"><c:out value="${person.firstName}  ${person.lastName}"/></a></td>
			            <td><c:out value="${person.license.number}"/></td>
			            <td><c:out value="${person.license.state}"/></td>
			            <td><c:out value="${person.license.expirationDate}"/></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>	
		
			</div>
		</div>
	</section>

</body>
</html>