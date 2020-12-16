<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Secret Code</title>
</head>
<body>
	<h1>What is the code?</h1>
	<form action="/process" method="post">
		<input type="text" name="code"/><br>
		<input type="submit" value="Try Code"/>
	</form>
</body>
</html>