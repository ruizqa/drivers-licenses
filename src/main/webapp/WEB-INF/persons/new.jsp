<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
<section>
	<div class="container">
			<form:form action="/persons" method="post" modelAttribute="person" class="col">
			    <div class="form-group my-2">
			        <form:label path="firstName" class="form-label">First Name</form:label>
			    </div>
			    <div class="form-group my-2">    
			        <form:errors path="firstName"/>
			        <form:input path="firstName" class="form-control"/>
			    </div>
			    <div class="form-group my-2">
			        <form:label path="lastName" class="form-label">Last Name</form:label>
			    </div>
			    
			    <div class="form-group my-2">
			        <form:errors path="lastName"/>
			        <form:input path="lastName" class="form-control"/>
			    </div>
			    
			    <div class="text-center">    
			    	<input class="btn btn-primary text-center my-2" type="submit" value="Submit"/>
			    </div>
			</form:form>
	</div>
</section>
</body>
</html>