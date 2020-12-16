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

<title>Add New Student</title>
<style>

    body {
        text-align: center;
        background-image: linear-gradient(45deg, silver, white, silver);

    }

    h1 {
        color: rgb(52, 52, 255);
    }



</style>
</head>
<body>

    <h1>New Student</h1>

    <form:form action="/student/new" method="post" modelAttribute="student">
    <p>
        First Name: 
        <form:input type="text" path="firstName"/>
        <form:errors path="firstName"/>
    </p>
    
    <p>
        Last Name: 
        <form:input type="text" path="lastName"/>
        <form:errors path="lastName"/>
    </p>
    
    <p>
        Age: 
        <form:input type="text" path="age"/>
        <form:errors path="age"/>
    </p>

    <button class="btn btn-dark" type="submit">Create</button>

    </form:form>


</body>
</html>