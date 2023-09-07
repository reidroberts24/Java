<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">	
	<meta charset="ISO-8859-1">
	<title>User Home</title>
</head>
<body>
	
	<div class="container mt-5">
	    <div class="jumbotron">
	        <h1 class="display-4">Welcome, <c:out value="${user.userName}" /></h1>
	        <p class="lead">Nothing to see here yet.</p>
	        <hr class="my-4">
	        <a class="btn btn-primary btn-lg" href="/logout" role="button">Logout</a>
	    </div>
	</div>

</body>
</html>