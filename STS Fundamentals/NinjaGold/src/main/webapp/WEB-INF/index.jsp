<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Ninja Gold</title>
</head>
<body>
	<h1>Your Gold: <c:out value="${money}"/></h1>
	<a href="/reset">Reset</a>
	<hr />
	<form action="/process" method="post">
	<h2>Farm</h2>
	<p>earns 10-20 gold</p>
	<input type="hidden" name="location" value="farm"/>
	<input type="submit" value="Find Gold"/>
	</form>
	
	<hr />
	<form action="/process" method="post">
	<h2>Cave</h2>
	<p>earns 5-10 gold</p>
	<input type="hidden" name="location" value="cave"/>
	<input type="submit" value="Find Gold"/>
	</form>
	
	<hr />
	<form action="/process" method="post">
	<h2>House</h2>
	<p>earns 2-5 gold</p>
	<input type="hidden" name="location" value="house"/>
	<input type="submit" value="Find Gold"/>
	</form>
	
	<hr />
	<form action="/process" method="post">
	<h2>Casino</h2>
	<p>earns/lose 0-50 gold</p>
	<input type="hidden" name="location" value="casino"/>
	<input type="submit" value="Find Gold"/>
	</form>
	
	<h1>Activity: </h1>
	<c:forEach items="${events}" var="info">
	${info}
	</c:forEach> 
	
	
</body>
</html>