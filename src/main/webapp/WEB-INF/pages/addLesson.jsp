<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<?xml version="1.0" encoding="ISO-8859-9" ?>

<%@ page language="java" contentType="text/html;  page"
	pageEncoding="UTF-8"%>

<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Add Lesson</title>
</head>
<body>
	<form:form method="POST" modelAttribute="lesson"
		action="/lesson/addLesson">
		<table>
			<tr>
				<td>Dersin adı:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Ekle"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>