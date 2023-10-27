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
<h1>New Ninja</h1>
	<a href="/">Back</a>

	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<p>
			<form:label path="dojo">Dojo:</form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
						<form:option value="${dojo.id}" path="dojo"><c:out value="${dojo.name}"/></form:option>
			    </c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="firstname">First Name:</form:label>
			<form:errors path="firstname"/>
			<form:input path="firstname"/>
		</p>
		<p>
			<form:label path="lastname">Last Name:</form:label>
			<form:errors path="lastname"/>
			<form:input path="lastname"/>
		</p>
		<p>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"/>
			<form:input path="age"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>

</body>
</html>