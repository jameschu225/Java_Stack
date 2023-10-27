<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Burger</h1>
	<a href="/">Go Back</a>
	    <div>
		    <form:form action="/burgers/update/${burger.id}" method="post" modelAttribute="burger">
		    <input type="hidden" name="_method" value="put"/>
			    <form:errors path="burgerName"/><br>
			    <form:errors path="restaurantName"/><br>
			    <form:errors path="numberOfRate"/><br>
			    <form:errors path="note"/><br>
			    	<p>
				    	<form:label path="burgerName">Burger Name</form:label>
					    <form:input path="burgerName"/>
				    </p>
				    <p>
				    	<form:label path="restaurantName">Restaurant Name</form:label>
					    <form:input path="restaurantName"/>
				    </p>
				    <p>
				    	<form:label path="numberOfRate">Rating</form:label>
					    <form:input type="number" path="numberOfRate"/>
				    </p>
				    <p>
				    	<form:label path="note">Notes</form:label>
					    <form:input type="textarea" path="note"/>
				    </p>
				    <input type="submit" value="Submit"/>
		    </form:form>
	    </div>
</body>
</html>