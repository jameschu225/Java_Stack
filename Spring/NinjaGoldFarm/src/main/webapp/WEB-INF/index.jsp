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
	<div>
		<label>Your Goal:</label>
		<label><c:out value="${gold}"></c:out></label>
	</div>
	<div>
		<div>
			<form action="/action" method="post">
				<input type="hidden" name="action" value="Farm">
				<p>Farm</p>
				<p>(earns 10-20 gold)</p>
				<button type="submit">Final Gold!</button>	
			</form>
			</div>
		<div>
			<form action="/action" method="post">
				<input type="hidden" name="action" value="Cave">
				<p>Cave</p>
				<p>(earns 5-10 gold)</p>
				<button type="submit">Final Gold!</button>	
			</form>
		</div>
		<div>
			<form action="/action" method="post">
				<input type="hidden" name="action" value="House">
				<p>House</p>
				<p>(earns 2-5 gold)</p>
				<button type="submit">Final Gold!</button>	
			</form>
		</div>
		<div>
			<form action="/action" method="post">
				<input type="hidden" name="action" value="Quest">
				<p>Quest</p>
				<p>(earns/takes 0-50 gold)</p>
				<button type="submit">Final Gold!</button>	
			</form>
		</div>
	</div>
	<div>
		<p>Activities:</p>
			<c:forEach var="action" items="${activityMessage}">
			<p><c:out value="${action}"/></p>
			</c:forEach>
	</div>
</body>
</html>