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
	<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="navbar">
                	<div class="container custom-container">
                    	<h1>Fruit Store</h1>
                    </div>
                </div>
                <div class="container custom-container-2 pt-2 pb-1">
	                <table class="table table-light table-bordered">
	                    <thead>
	                        <tr>
	                            <th>Fruit</th>
	                            <th>Price</th>
	                        </tr>
	                    </thead>
	                    <c:forEach var="fruit" items="${fruits}">
	                        <tr>
	                            <c:if test="${fruit.name.startsWith('G')}">
		                            <td style="color: orange;">
		                                <c:out value="${fruit.name}"/>
		                            </td>
		                            <td style="color: orange;">
		                                $<c:out value="${fruit.price}" />
		                            </td>
	                            </c:if>
                    			<c:if test="${!fruit.name.startsWith('G')}">
		                            <td>
		                                <c:out value="${fruit.name}"/>
		                            </td>
		                            <td>
		                                $<c:out value="${fruit.price}" />
		                            </td>
	                            </c:if>
	                        </tr>
	                    </c:forEach>
	                </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>