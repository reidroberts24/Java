<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<meta charset="ISO-8859-1">
	<title>Expense Details</title>
</head>
<body>
<div class="container d-flex flex-column align-items-center justify-content-center vh-100">
    <!-- Display Expense Details -->
    <div class="mb-4 w-50">
        <h2 class="mb-3">Expense Details</h2>
        <p><strong>Expense Name:</strong> ${expense.item}</p>
        <p><strong>Vendor:</strong> ${expense.vendor}</p>
        <p><strong>Amount:</strong> $<fmt:formatNumber value="${expense.amount}" pattern="#0.00"/></p>
        <p><strong>Description:</strong> ${expense.description}</p>
    </div>
    <div class="d-flex justify-content-center">
        <a href="/expenses" class="btn btn-primary">Back to Expenses</a>
    </div>
</div>
</body>
</html>