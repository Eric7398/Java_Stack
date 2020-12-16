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

<title>Add Contact Information</title>
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

    <h1>Contact Info</h1>

    <form:form action="/contact/new" method="post" modelAttribute="contact">


    <p><c:out value="${student.firstName}"/> <c:out value="${student.lastName}"/>
        <form:hidden path="student" value="${student.id}"/>
    </p>

    <p>
        Address: 
        <form:input type="text" path="address" value="${student.contact.address}"/>
        <form:errors path="address"/>
    </p>
    
    <p>
        City: 
        <form:input type="text" path="city" value="${student.contact.city}"/>
        <form:errors path="city"/>
    </p>
    
    <p>
        State: 
        <form:input type="text" path="state" value="${student.contact.state}"/>
        <form:errors path="state"/>
    </p>

    <button class="btn btn-dark" type="submit">Create</button>

    </form:form>






</body>
</html>