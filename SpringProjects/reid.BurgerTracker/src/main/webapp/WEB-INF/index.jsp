<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<meta charset="ISO-8859-1">
	<title>Burger Tracker</title>
</head>
<body>
<div class="container d-flex flex-column align-items-center justify-content-center vh-100">
    <!-- Burger Tracker Table -->
    <div class="mb-4 w-50">
        <h2 class="mb-3">Burger Tracker</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Burger Name</th>
                    <th>Restaurant Name</th>
                    <th>Rating</th>
                    <th>Notes</th>
                </tr>
            </thead>
            <tbody>
                <!-- Sample Data (You can add more rows or use a server-side language to populate this) -->
                <c:forEach var="burger" items="${burgers}">
			        <tr>
			            <td><c:out value="${burger.burgerName}" /></td>
			            <td><c:out value="${burger.restaurantName}" /></td>
			            <td><c:out value="${burger.rating}" /></td>
			            <td><c:out value="${burger.notes}" /></td>
		            	<td><a href="/burgers/${burger.id}/edit">Edit</a></td> 
			        </tr>
			    </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Burger Form -->
    <div class="w-50">
        <h2 class="mb-3">Burger Form</h2>
        <form:form modelAttribute="burger" action="/addBurger" method="post">
            <div class="form-group">
                <label for="burgerName">Burger Name:</label>
                <form:input type="text" class="form-control" path="burgerName" name="burgerName"></form:input>
            </div>
            <div class="form-group">
                <label for="restaurantName">Restaurant Name:</label>
                <form:input type="text" class="form-control" path="restaurantName" name="restaurantName"></form:input>
            </div>
            <div class="form-group">
                <label for="rating">Rating (1-5):</label>
                <form:input type="number" class="form-control" path="rating" name="rating" min="1" max="5"></form:input>
            </div>
            <div class="form-group">
                <label for="notes">Notes:</label>
                <form:textarea class="form-control" path="notes" name="notes" rows="3"></form:textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>

</div>
</body>
</html>