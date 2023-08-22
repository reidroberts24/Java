<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Dojo Page</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${name}" /> </h1>
    <p>Item Name: <c:out value="${itemName}" /></p>
    <p>Price: $<c:out value="${price}" /></p>
    <p>Description: <c:out value="${description}" /></p>
    <p>Vendor: <c:out value="${vendor}" /></p>
</body>
</html>
