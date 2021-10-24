<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>
<section>
	<div class="container">
			<form:form action="/licenses" method="post" modelAttribute="license" class="col">
			    
			    <div class="form-group my-2">
			        <form:label path="person" class="form-label">Person</form:label>
			    </div>
			
				<div class="form-group my-2">
			        <form:select path="person">
					    <c:forEach var="person" items="${persons}" >
					        <form:option value="${person}" label="${person.firstName} ${person.lastName}"/>
					    </c:forEach>
					</form:select>
			    </div>

			
			    <div class="form-group my-2">
			        <form:label path="state" class="form-label">State</form:label>
			    </div>
			    <div class="form-group my-2">    
			        <form:errors path="state"/>
			        <form:input path="state" class="form-control"/>
			    </div>
			    <div class="form-group my-2">
			        <form:label type="date" path="expirationDate" class="form-label">Expiration Date</form:label>
			    </div>
			    
			    <div class="form-group my-2">
			        <form:errors type="date" path="expirationDate"/>
			        <form:input type="date" path="expirationDate" class="form-control"/>
			    </div>
			    
			    <div class="text-center">    
			    	<input class="btn btn-primary text-center my-2" type="submit" value="Submit"/>
			    </div>
			</form:form>
	
	</div>
</section>
</body>
</html>