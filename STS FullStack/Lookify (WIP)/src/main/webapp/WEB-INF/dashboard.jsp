<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Insert Title</title>
</head>
<body>
	<a href="/new">Add New</a><br />
	<a href="/top">Top Songs</a>

	<form action="/search" method="post">
		<input type="text" value="Search..."/>
		<input type="submit" value="Search Artist"/>
	</form>
	
	
	<table>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>Action</th>
		</tr>
	
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>

	
</body>
</html>