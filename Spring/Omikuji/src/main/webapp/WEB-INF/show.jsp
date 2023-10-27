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
	<h1>Here's Your Omikuji!</h1>
	<div class="d">
	<p>
	In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with
	<c:out value="${person}"/> as your roommate, <c:out value="${hobby}"/> for a living.
	The next time you see <c:out value="${livingthing}"/>, you will have good luck. Also,
	<c:out value="${saying}"/>.
	</p>
	</div>
	<a href="/Omikuji">Go Back</a>
</div>
</body>
</html>