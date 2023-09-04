<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Burger Details</title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <h1 class="text-center mb-4">Edit Burger Details</h1>
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <form:form modelAttribute="burger" action="/burgers/${burger.id}" method="post">
                        <div class="mb-3">
                            <strong><label for="burgerName">Burger Name:</label></strong>
                            <form:input path="burgerName" class="form-control" value="${burger.burgerName}" />
                        </div>
                        <div class="mb-3">
                            <strong><label for="restaurantName">Restaurant Name:</label></strong>
                            <form:input path="restaurantName" class="form-control" value="${burger.restaurantName}" />
                        </div>
                        <div class="mb-3">
                            <strong><label for="rating">Rating:</label></strong>
                            <form:input type="number" path="rating" class="form-control" value="${burger.rating}" min="1" max="5"/>
                        </div>
                        <div class="mb-3">
                            <strong><label for="notes">Notes:</label></strong>
                            <form:textarea path="notes" class="form-control" value="${burger.notes}"></form:textarea>
                        </div>
                        <div class="d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary">Update</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
