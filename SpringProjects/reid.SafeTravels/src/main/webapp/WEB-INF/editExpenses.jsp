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
	<title>Edit Expenses</title>
</head>
<body>
<div class="container d-flex flex-column align-items-center justify-content-center vh-100">
    <!-- Edit Expense Details -->
    <div class="mb-4 w-50">
        <h2 class="mb-3">Edit Expense Details</h2>
        <form:form modelAttribute="expense" action="/editExpense/${expense.id}/submit" method="post">
            <div class="form-group">
                <label for="item">Expense Name:</label>
                <form:input path="item" class="form-control" value="${expense.item}" />
            </div>
            <div class="form-group">
                <label for="vendor">Vendor:</label>
                <form:input path="vendor" class="form-control" value="${expense.vendor}" />
            </div>
            <div class="form-group">
                <label for="amount">Amount:</label>
                <form:input type="number" step="0.01" path="amount" class="form-control" value="${expense.amount}" />
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <form:textarea path="description" class="form-control" value="${expense.description}"></form:textarea>
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Update</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>