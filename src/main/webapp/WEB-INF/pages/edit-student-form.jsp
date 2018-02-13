<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<?xml version="1.0" encoding="ISO-8859-9" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
<title>Edit student page</title>
</head>
<body>
	<h1>Edit student page</h1>
	<p>Here you can edit the existing student.</p>
	<p>${message}</p>
	<form:form  method="POST" modelAttribute="student"
		action="${pageContext.request.contextPath}/student/edit/${student.id}.html">
		<table border="3">
			<tbody>
				<tr>
					<td>Adı:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Rati:</td>
					<td><form:input path="rating" /></td>
				</tr>
				<tr>
					<td>Okulu:</td>
					<td><form:input path="school" /></td>
				</tr>
				<tr>
					<td>Öğrenci Numarası :</td>
					<td><form:input path="studentId" /></td>
				</tr>
				<tr>
					<td>Dersleri:</td>
					<td><form:input disabled="true" path="lessons" /></td>
				</tr>
				<tr>
					<td>Dersi Seçiniz:</td>
					<td><form:select path="lessons">
							<form:options itemValue="id" items="${lessonss}" itemLabel="name" />
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Edit" /></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>
</body>
</html>