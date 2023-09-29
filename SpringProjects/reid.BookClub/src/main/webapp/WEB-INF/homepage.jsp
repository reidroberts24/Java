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
    	<div class="row">
        	<div class="col-md-8">
            	<h1>Welcome, ${user.name}!</h1>
        	</div>
	        <div class="col-md-4 text-right">
			    <div class="mb-2">
			        <button type="button" class="btn btn-primary w-100">Logout</button>
			    </div>
			    <div>
			        <button type="button" class="btn btn-secondary w-100">Add To My Shelf</button>
			    </div>
			</div>
    	</div>
	    <hr>
	    <p>Here are books from everyone's shelves:</p>
		<table class="table table-striped">
	        <thead>
	            <tr>
	                <th>ID</th>
	                <th>Title</th>
	                <th>Author</th>
	                <th>Posted By</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach var="book" items="${books}">
	                <tr>
	                    <td>${book.id}</td>
	                    <td><a href="#">${book.title}</a></td>
	                    <td>${book.authorName}</td>
	                    <td>${book.user.name}</td>
	                </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	</div>
</body>
</html>