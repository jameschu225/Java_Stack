<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="c">
	<h1>Send A Omikuji!</h1>
	<form action="/decode" method="POST">
	<div class="a">
		<div class="b">
			<label>Pick any number from 5 to 25</label>
<!-- 			<input type="text" name="number">
 -->			
 			<select name="number">
 				<option value="none">Select an number</option>
 				<c:forEach var="year" items="${years}">
				    <option value="year"><c:out value="${year}"/></option>
				    </c:forEach>
			 </select>
		</div>
		<div class="b">
			<label>Enter the name of any city:</label>
			<input type="text" name="city">
		</div>
		<div class="b">
			<label>Enter the name of any real person:</label>
			<input type="text" name="person">
		</div>
		<div class="b">
			<label>Enter professional endeavor or hobby:</label>
			<input type="text" name="hobby">
		</div>
		<div class="b">
			<label>Enter any type of living thing:</label>
			<input type="text" name="livingthing">
		</div>
		<div class="b">
			<label>Say something nice to someone:</label>
			<textarea rows="20" cols="10" name="saying"></textarea>
		</div>
		<div class="b">
			<label>Send and show a friend</label>
			<button type="submit">Send</button>
		</div>
	</div>
	</form>
</div>
</body>
</html>