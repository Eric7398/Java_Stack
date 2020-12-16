<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Insert Title</title>
</head>
<body>
	<h1>Create a Ninja!</h1>
	
	<form:form action="/createNinja" method="POST" modelAttribute="ninja">
		<p>First Name:</p>
		<form:label path="firstName"></form:label>
		<form:errors path="firstName"></form:errors>
		<form:input path="firstName"></form:input>
		
		<p>Last Name:</p>
		<form:label path="lastName"></form:label>
		<form:errors path="lastName"></form:errors>
		<form:input path="lastName"></form:input>
		
		<p>Age:</p>
		<form:label path="age"></form:label>
		<form:errors path="age"></form:errors>
		<form:input path="age"></form:input>
		
		
		<p>Dojo:</p>
		<form:label path="dojo"></form:label>
		<form:errors path="dojo"></form:errors>
		<form:select path="dojo">
			<option value="" disabled selected>Select a team!</option>
			<c:forEach items="${dojos}" var="dojo">
				<form:option value="${dojo}">
					<c:out value="${dojo.name}"></c:out>
				</form:option>
			</c:forEach>
		</form:select>	
		
		<input type="submit" value="Create a Ninja"/>
	
	
	</form:form>
	
	
	
	
	
</body>
</html>