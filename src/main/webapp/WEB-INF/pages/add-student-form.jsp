
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<?xml version="1.0" encoding="UTF-8" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Öğrenci Ekleme Sayfası</title>
</head>
<body>

	<h1 align="center">Öğrenci Ekleme Safası</h1>
	<p align="center">Buradan sisteme öğrenci ekleyebilirsiniz.</p>
	<form:form method="POST" modelAttribute="student" action="add">
		<table style="background-color: blue" border="5" width="30%"
			cellpadding="5" align="center">
			<tbody>
				<!-- 				<input type="hidden" value="id"> -->
				<tr>
					<td>Adı:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Rating:</td>
					<td><form:input path="rating" /></td>
				</tr>
				<tr>
					<td>Okulu:</td>
					<td><form:input path="school" /></td>
				</tr>
				<tr>
					<td>Öğrenci Numarası:</td>
					<td><form:input maxlength="6" path="studentId" /></td>
				</tr>
				<tr>
					<td>Dersi Seçiniz:</td>
					<td><form:select path="lessons">
							<form:options itemValue="id" items="${lessonss}" itemLabel="name" />
						</form:select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Add" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Ana Menü</a>
	</p>

</body>
</html>