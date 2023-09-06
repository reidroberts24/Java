<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

	<title>All Dojos</title>
</head>
<body>
	<div class="container mt-5">
    <h2 class="text-center mb-4">List of Dojos</h2>

    <!-- Buttons to add a new Dojo and Ninja -->
    <div class="mb-4 text-center">
        <a href="<c:url value='/dojos/new'/>" class="btn btn-success mr-2">Add New Dojo</a>
        <a href="<c:url value='/ninjas/new'/>" class="btn btn-warning">Add New Ninja</a>
    </div>

    <!-- Scrollable container for the list of Dojos -->
    <div style="max-height: 500px; overflow-y: auto;"> <!-- Adjust the max-height as per your requirement -->
        <ul class="list-group">
            <!-- Loop through the list of dojos using JSTL -->
            <c:forEach var="dojo" items="${dojos}">
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    <!-- Using a button style link for each dojo -->
                    <a href="<c:url value='/dojos/${dojo.id}'/>" class="btn btn-primary w-100">
                        ${dojo.name}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>

</body>
</html>