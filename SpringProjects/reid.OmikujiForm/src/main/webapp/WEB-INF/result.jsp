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
	    <h2>Omikuji Result</h2>
	    <p>In ${omikuji.number} years, you will live in ${omikuji.city} with ${omikuji.person} as your roommate, ${omikuji.hobby} for a living.
	    The next time you see a ${omikuji.thing}, you will have good luck. Also, ${omikuji.comment}.</p>
	</div>
</body>
</html>