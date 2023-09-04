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
	<title>Expense Tracker</title>
</head>
<body>
<div class="container d-flex flex-column align-items-center justify-content-center vh-100">
    <!-- Expense Tracker Table -->
    <div class="mb-4 w-50">
        <h2 class="mb-3">Expense Tracker</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Sample Data -->
                <c:forEach var="expense" items="${expenses}">
			        <tr>
			            <td><a href="/viewExpense/${expense.id}"><c:out value="${expense.item}" /></a></td>
			            <td><c:out value="${expense.vendor}" /></td>
			            <td>$<fmt:formatNumber value="${expense.amount}" pattern="#0.00"/></td>
		            	<td><a href="/editExpense/${expense.id}">Edit</a></td>
						<td>
						    <form action="/deleteExpense/${expense.id}" method="post" class="d-inline-block">
						        <input type="hidden" name="_method" value="delete">
						        <button type="submit" class="btn btn-sm btn-danger" onclick="return confirm('Are you sure you want to delete this item?');">Delete</button>
						    </form>
						</td>	           
			        </tr>
			    </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Expense Form -->
    <div class="w-50">
    <h2 class="mb-3">Add Expense</h2>
    <form:form modelAttribute="expense" action="/addExpense" method="post">
        <div class="form-group">
            <label for="item">Expense Name:</label>
            <form:input type="text" class="form-control" path="item" name="item"></form:input>
        </div>
        <div class="form-group">
            <label for="vendor">Vendor:</label>
            <form:input type="text" class="form-control" path="vendor" name="vendor"></form:input>
        </div>
        <div class="form-group">
            <label for="amount">Amount:</label>
            <form:input type="number" step="0.01" class="form-control" path="amount" name="amount"></form:input>
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <form:textarea class="form-control" path="description" name="description" rows="3"></form:textarea>
        </div>
        <button type="submit" class="btn btn-primary">Add</button>
   	</form:form>
</div>
</div>
</body>
</html>
