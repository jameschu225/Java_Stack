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
<h1>Dojos And Ninjas</h1>
	<a href="/dojos/new">New Dojo</a>
	<a href="/ninjas/new">New Ninja</a>
<br>
<div>
	<ul>
		<c:forEach var="dojo" items="${dojos}">
	          <li><a href="/dojos/<c:out value="${dojo.id}"/>"><c:out value="${dojo.name}"/></a></li>
	     </c:forEach>
	</ul>
</div>
</body>
</html>