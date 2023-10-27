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
<h1>Edit Expense</h1>
	<a href="/">Go Back</a>
	    <div>
		    <form:form action="/expense/edit/${travel.id}" method="post" modelAttribute="travel">
		    <input type="hidden" name="_method" value="put"/>
			    <form:errors path="expenseName"/><br>
			    <form:errors path="venderName"/><br>
			    <form:errors path="amount"/><br>
			    <form:errors path="description"/><br>
			    	<p>
				    	<form:label path="expenseName">Expense Name:</form:label>
					    <form:input path="expenseName"/>
				    </p>
				    <p>
				    	<form:label path="venderName">Vender:</form:label>
					    <form:input path="venderName"/>
				    </p>
				    <p>
				    	<form:label path="amount">Amount: $</form:label>
					    <form:input type="number" step="any" path="amount"/>
				    </p>
				    <p>
				    	<form:label path="description">Description</form:label>
					    <form:input type="textarea" path="description"/>
				    </p>
				    <input type="submit" value="Submit"/>
		    </form:form>
	    </div>
</body>
</html>