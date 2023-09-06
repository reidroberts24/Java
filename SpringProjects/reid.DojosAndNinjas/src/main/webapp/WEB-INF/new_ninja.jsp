<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">	
	<title>New Ninja</title>
</head>
<body>
 	<div class="container mt-5">
        <h2 class="text-center mb-4">Add a New Ninja</h2>

        <form:form action="/ninjas/new" method="post" class="mb-5">
            <!-- First Name Field -->
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required>
            </div>

            <!-- Last Name Field -->
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required>
            </div>

            <!-- Age Field -->
            <div class="form-group">
                <label for="age">Age:</label>
                <input type="number" class="form-control" id="age" name="age" required>
            </div>

            <!-- Dojo Dropdown -->
            <div class="form-group">
                <label for="dojo">Dojo:</label>
                <select class="form-control" id="dojo" name="dojo">
                    <c:forEach var="dojo" items="${dojos}">
                        <option value="${dojo.id}">${dojo.name}</option>
                    </c:forEach>
                </select>
            </div>

            <!-- Submit Button -->
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Add Ninja</button>
            </div>
        </form:form>
    </div
</body>
</html>