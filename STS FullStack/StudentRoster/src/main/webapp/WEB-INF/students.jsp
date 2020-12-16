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

<title>All Students</title>
<style>

    body {
        text-align: center;
        background-image: linear-gradient(45deg, silver, white, silver);
    }



</style>

</head>
<body>

    <h1>All Students</h1>
    <a href="/student/new">Add a new student</a>
    <hr>

    <table class="table table-striped table-bordered">

        <thead class="thead-dark">

                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                </tr>

        </thead>

        <tbody>   

            <c:forEach items="${students}" var="student">

                <tr>
                    <td><a href="/contact/new/${student.id}">${student.firstName} ${student.lastName}</a></td>
                    <td>${student.age}</td>
                    <td>${student.contact.address}</td>
                    <td>${student.contact.city}</td>
                    <td>${student.contact.state}</td>
                </tr>

            </c:forEach>

        </tbody>

    </table>


</body>
</html>