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
	<h1>
		<c:out value="${book.title}"/>
	</h1>
	<div>
		<label>Description: </label>
		<c:out value="${book.description}"/>
	</div>
	<div>
		<label>Language: </label>
		<c:out value="${book.language}"/>
	</div>
	<div>
		<label>Number of Pages: </label>
		<c:out value="${book.numberOfPages}"/>
	</div>
	<a href="/books">Back</a>
</body>
</html>