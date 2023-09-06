<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<title>See Dojos's Ninjas</title>
</head>
<body>

	<div class="container mt-5">
	    <div class="d-flex justify-content-between align-items-center mb-4"> <!-- Added align-items-center for vertical centering -->
	        <h1 class="mb-0">${dojo.name}</h1> <!-- removed default bottom margin -->
	
	        <!-- Delete Dojo button -->
	        <a href="<c:url value='/dojos/delete/${dojo.id}'/>" class="btn btn-danger ml-3" onclick="return confirm('Are you sure you want to delete this dojo?');">Delete Dojo</a>
	    </div>
	    
	    <div class="mb-3">
	        <h3>Ninjas:</h3>
	    </div>
	
	    <c:forEach var="ninja" items="${ninjas}">
	        <div class="card mb-3">
	            <div class="card-body">
	                <h5 class="card-title">${ninja.firstName} ${ninja.lastName}</h5>
	                <p class="card-text">Age: ${ninja.age}</p>
	            </div>
	        </div>
	    </c:forEach>
	</div>

</body>
</html>