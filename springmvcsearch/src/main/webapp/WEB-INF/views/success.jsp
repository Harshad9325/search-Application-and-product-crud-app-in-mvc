<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Name is :- ${student.name }</h1>
	<h1> Id is :- ${student.id }</h1>
	<h1> DOB is :- ${student.DOB }</h1>
	<h1> Courses is :- ${student.courses }</h1>
	<h1> Gender is :- ${student.gender }</h1>
	<h1> Type is :- ${student.type }</h1>
	<hr>
	<h1> Address Street is :- ${student.address.street }</h1>
	<h1> Address City is :- ${student.address.city }</h1>
</body>
</html>