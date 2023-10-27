<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
	<a href="/">Back</a>

<table>
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="ninja" items="${dojo.ninjas}">
         	<tr>
           		<td><c:out value="${ninja.firstname}"/></td>
           		<td><c:out value="${ninja.lastname}"/></td>
              	<td><c:out value="${ninja.age}"/></td>
         	</tr>
         </c:forEach>
    </tbody>
</table>
</body>
</html>