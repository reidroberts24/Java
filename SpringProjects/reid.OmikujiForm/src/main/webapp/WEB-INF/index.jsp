<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<title>Omikuji Form</title>
</head>
<body>
	<div class="container mt-5">
	   	<h2>Omikuji Form</h2>
    	<form name="omikuji" action="/omikuji/submit" method="post">
		    <div class="form-group">
		        <label for="number">Number:</label>
		        <input name="number" class="form-control" id="number" required/>
		    </div>
		    
		    <div class="form-group">
		        <label for="city">City:</label>
		        <input name="city" class="form-control" id="city" required/>
		    </div>
		
		    <div class="form-group">
		        <label for="person">Person:</label>
		        <input name="person" class="form-control" id="person" required/>
		    </div>
		
		    <div class="form-group">
		        <label for="hobby">Hobby:</label>
		        <input name="hobby" class="form-control" id="hobby" required/>
		    </div>
		
		    <div class="form-group">
		        <label for="thing">Thing:</label>
		        <input name="thing" class="form-control" id="thing" required/>
		    </div>
		
		    <div class="form-group">
		        <label for="comment">Comment:</label>
		        <textarea name="comment" class="form-control" id="comment" required></textarea>
		    </div>
		
		    <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>