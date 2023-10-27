<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Expense Details</h1>
	<a href="/">Go Back</a>
	<div>
		<label>Expense Name: </label>
		<p><c:out value="${travel.expenseName}"/></p>
		<label>Expense Description: </label>
		<p><c:out value="${travel.description}"/></p>
		<label>Vender: </label>
		<p><c:out value="${travel.venderName}"/></p>
		<label>Amount: </label>
		<p>$<c:out value="${travel.amount}"/></p>
	</div>
</body>
</html>