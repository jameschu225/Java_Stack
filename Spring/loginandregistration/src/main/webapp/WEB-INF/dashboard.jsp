<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
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
	<h1>Welcome!</h1>
	<h2>Join our growing community.</h2>
	<div>
		<form:form action="/register" method="post" modelAttribute="registeruser">
		<p>Register</p>
		<p>
			<form:label path="username">User Name:</form:label>
			<form:errors path="username"/>
			<form:input path="username"/>
		</p>
		<p>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</p>
		<p>
			<form:label path="password">Password:</form:label>
			<form:errors path="password"/>
			<form:password path="password"/>
		</p>
		<p>
			<form:label path="confirmpassword">Confirm PW:</form:label>
			<form:errors path="confirmpassword"/>
			<form:password path="confirmpassword"/>
		</p>
		<input type="submit" value="Submit"/>		
		</form:form>
	</div>
	<div>
		<form:form action="/login" method="post" modelAttribute="loginuser">
			<p>Log In</p>
			<p>
				<form:label path="email">Email:</form:label>
				<form:errors path="email"/>
				<form:input path="email"/>
			</p>
			<p>
				<form:label path="password">Password:</form:label>
				<form:errors path="password"/>
				<form:password path="password"/>
			</p>
			<input type="submit" value="Submit"/>		
		</form:form>
	</div>
</body>
</html>