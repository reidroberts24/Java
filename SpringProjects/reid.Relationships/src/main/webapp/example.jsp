<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--- ... --->
<h1>Person Details:></h1>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>License Number</th>
            <th>State</th>
            <th>Exp Date</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <c:out value="${person.firstName}"/>
                <c:out value="${person.lastName}"/>
            </td>
            <td><c:out value="${person.license.number}"/></td>
            <td><c:out value="${person.license.state}"/></td>
            <td>
                <c:out value="${person.license.expirationDate}"/>
            </td>
        </tr>
    </tbody>
</table>
<!--- ... --->

</body>
</html>