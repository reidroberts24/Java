<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Dojo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">New Dojo</h2>
    
    <form:form action="/dojos/new" method="POST" modelAttribute="dojo">
        <div class="form-group">
            <label for="dojoName">Dojo Name:</label>
            <input type="text" class="form-control" id="dojoName" placeholder="Enter Dojo Name" name="name">
        </div>
        <button type="submit" class="btn btn-primary">Create</button>
    </form:form>
    
</div>
</body>
</html>