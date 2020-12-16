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
	
	<h1>Create a Dojo!</h1>
	
	<form:form action="/createDojo" method="POST" modelAttribute="dojo">
		<p>Name:</p>
		<form:label path="name"></form:label>
		<form:errors path="name"></form:errors>
		<form:input path="name"></form:input>
		
		<p>
			<input type="submit" value="Submit"/>
		</p>
	</form:form>
	
</body>
</html>