<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h1>New Dojo</h1>
	<form:form action="/dojos" method="post" modelAttribute="dojo">
		<div>
			
			<form:label path="name">Dojo Name:</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form> 
	
	<h1>All Dojos</h1>
	<c:forEach var="dojo" items="${dojo.name}">
		<h3><c:out value="${dojo}"></c:out></h3>
	</c:forEach>
	
	   
			
	
	

	
	
	
	
		
		
		
</body>
</html>
