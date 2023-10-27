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
<h1>Save Travels</h1>
<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vender</th>
            <th>Amount</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
         <!-- loop over all the books to show the details as in the wireframe! -->
         <c:forEach var="travel" items="${allTravels}">
         	<tr>
           		<td><a href="/expenses/${travel.id}"/><c:out value="${travel.expenseName}"/></a></td>
           		<td><c:out value="${travel.venderName}"/></td>
              	<td>$<c:out value="${travel.amount}"/></td>
              	<td><a href="/expense/edit/<c:out value="${travel.id}"/>">edit</a></td>
              	<td>
	              	<form:form action="expenses/delete/${travel.id }" method="post">
					    <input type="hidden" name="_method" value="delete"/>
	        	      	 <input type="submit" value="delete"/>
			    	</form:form>
              	</td>
         	</tr>
         </c:forEach>
    </tbody>
</table>
<br>
	<div>
		<h2> Add a expense:</h2>
	    <div>
		    <form:form action="/newexpense" method="post" modelAttribute="travel">
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
				    	<form:label path="amount">Amount:</form:label>
					    <form:input type="number" step="any" path="amount"/>
				    </p>
				    <p>
				    	<form:label path="description">Description:</form:label>
					    <form:input type="textarea" path="description"/>
				    </p>
				    <input type="submit" value="Submit"/>
		    </form:form>
	    </div>
	</div>

</body>
</html>