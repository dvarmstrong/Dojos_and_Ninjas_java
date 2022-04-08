<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninjas</title>
</head>
<body>
	<h1>New Ninjas </h1>
	
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<div>
	        <form:label path="firstName">First Name:</form:label>
	        <form:input path="firstName"/>
	    </div>
	    
	    <div>
	        <form:label path="lastName">Last Name:</form:label>
	        <form:input path="lastName"/>
	    </div>
	    <div>
	        <form:label path="age">Age:</form:label>
	        <form:input path="age"/>
	    </div>
	    <div>
	    	<form:label path="dojo">Dojo:</form:label>
	    	<form:select path="dojo">
	    		<c:forEach var="dojo" items="${dojos }">
	    		<option value="${dojo.id}"><c:out value="${dojo.name }"></c:out></option>
	    		</c:forEach>
	    	</form:select>
	    	 <input type="submit" value="Create"/>
	    </div>
     </form:form>
	    	
</body>
</html>