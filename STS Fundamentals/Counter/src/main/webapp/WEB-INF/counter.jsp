<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Counter</title>
</head>
<body>
	
	<h3>You have visited <a href="/">this site</a> <c:out value="${count}"/> times</h3>
	<a href="http://localhost:8080">Test another visit?</a><br>
	<a href="/reset">Reset</a>
	
</body>
</html>