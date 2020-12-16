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
	<h1>Hello World</h1>
	
	<a href="/createDojo">Create a new Dojo!</a> | <a href="/createNinja">Create a new Ninja!</a>
	<hr />
	
	<c:forEach items="${dojos}" var="dojo">
		<h3><c:out value="${dojo.name}"></c:out></h3>
		<c:forEach items="${dojo.ninjas}" var="i">
		<h5><c:out value="${i.firstName}"></c:out></h5>
		<hr />
		</c:forEach>
	</c:forEach>
	
</body>
</html>