<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Delete Student Page</title>
</head>
<body>

	<h1 style="color: red" align="center">Öğrenci Bilgileri</h1>

	<form:form method="POST"
		action="${pageContext.request.contextPath}/student/deleteStudentFinal/${student.studentId}.html">
		<table border="3">
			<tbody>
				<tr>
					<td>Name:</td>
					<td><form:label path="name" /></td>
				</tr>
				<tr>
					<td>Rating:</td>
					<td><form:label path="rating" /></td>
				</tr>
				<tr>
					<td>School:</td>
					<td><form:label path="school" /></td>
				</tr>
				<tr>
					<td>Student Id:</td>
					<td><form:label path="studentId" /></td>
				</tr>
				
			</tbody>
			
		</table>
		<input type="submit" value="Sil">
	</form:form>

	</form>


</body>

</html>
