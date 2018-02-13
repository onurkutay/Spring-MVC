<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html;  page"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>List of students</title>

</head>
<body>
	<h1 style="color: red" align="center">List of students</h1>
	<p>Here you can see the list of the students, edit them, remove or
		update.</p>
	<table align="center" border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th width="10%">id</th>
				<th width="15%">name</th>
				<th width="10%">rating</th>
				<th width="20%">school</th>
				<th width="10%">schoolId</th>
				<th width="10%">lessons</th>
				<th width="10%">actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.rating}</td>
					<td>${student.school}</td>
					<td>${student.studentId}</td>
					<td>${student.lessons}</td>
					<td><a
						href="${pageContext.request.contextPath}/student/edit/${student.id}.html">Edit</a><br />
						<a
						href="${pageContext.request.contextPath}/student/delete/${student.id}.html">Delete</a><br />
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>

</body>
</html>