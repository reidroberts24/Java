<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <title>Book Details</title></head>
<body>
    <h2>Book Details:</h2>
    <p><strong>Title:</strong> ${book.title}</p>
    <p><strong>Description:</strong> ${book.description}</p>
    <p><strong>Language:</strong> ${book.language}</p>
    <p><strong>Number of Pages:</strong> ${book.numberOfPages}</p>
</body>
</html>