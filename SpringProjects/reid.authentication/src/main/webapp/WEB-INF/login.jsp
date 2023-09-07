<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">	
	<meta charset="ISO-8859-1">
	<title>Login Page</title>
</head>
<body>
		
	<div class="container mt-5">
	    <h2 class="text-center">Welcome</h2>
	
	    <div class="row mt-4">
	        <!-- Registration Form -->
	        <div class="col-md-6">
	            <h4>Register</h4>
	            <form:form action="/register" method="post" modelAttribute="newUser">
	                <div class="form-group">
	                    <label for="username">Username:</label>
	                    <form:input path="userName" id="userName" placeholder="Enter username" class="form-control" required="true" />
	                    <form:errors path="userName" class="text-danger" />
	                </div>
	                <div class="form-group">
	                    <label for="registerEmail">Email:</label>
	                    <form:input type="email" path="email" id="registerEmail" placeholder="Enter email" class="form-control" required="true" />
	                    <form:errors path="email" class="text-danger" />
	                </div>
	                <div class="form-group">
	                    <label for="registerPassword">Password:</label>
	                    <form:password path="password" id="registerPassword" placeholder="Enter password" class="form-control" required="true" />
	                    <form:errors path="password" class="text-danger" />
	                </div>
	                <div class="form-group">
	                    <label for="confirm">Confirm Password:</label>
	                    <form:password path="confirm" id="confirm" placeholder="Confirm password" class="form-control" required="true" />
	                    <form:errors path="confirm" class="text-danger" />
	                </div>
	                <button type="submit" class="btn btn-primary">Submit</button>
	            </form:form>
	        </div>
	
	        <!-- Login Form -->
	        <div class="col-md-6">
	            <h4>Login</h4>
	            <form:form action="/login" method="post" modelAttribute="newLogin">
	                <div class="form-group">
	                    <label for="loginEmail">Email:</label>
	                    <form:input type="email" path="email" id="loginEmail" placeholder="Enter email" class="form-control" required="true" />
	                    <form:errors path="email" class="text-danger" />
	                </div>
	                <div class="form-group">
	                    <label for="loginPassword">Password:</label>
	                    <form:password path="password" id="loginPassword" placeholder="Enter password" class="form-control" required="true" />
	                    <form:errors path="password" class="text-danger" />
	                </div>
	                <button type="submit" class="btn btn-primary">Submit</button>
	            </form:form>
	        </div>
	    </div>
	</div>

</body>
</html>