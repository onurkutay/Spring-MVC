<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9" />
<title>Home page</title>
</head>
<body
	background="https://thumbs.dreamstime.com/z/bow-knot-scrolled-paper-over-white-background-40498606.jpg">
	<h1 style="color: red" align="center">Öğrenci Sistemine
		Hoşgeldiniz</h1>

	<form action="/student" method="get">
		<table style="background-color: blue" border="5" cellpadding="5"
			align="center">
			<thead>
				<tr>
					<th colspan="2">Yapmak istediğiniz işlemi seçiniz</th>
				</tr>
			</thead>
			<tr>
				<td><input style="height: 30px; width: 250px" type="button"
					onclick="location.href='${pageContext.request.contextPath}/student/add.html'"
					value="Öğrenci Ekle"> </input></td>
			</tr>
			<tr>
				<td><input style="height: 30px; width: 250px" type="button"
					onclick="location.href='${pageContext.request.contextPath}/student/list.html'"
					value="Öğrenci Listesi"> </input></td>
			</tr>
			<tr>
				<td><input style="height: 30px; width: 250px" type="button"
					onclick="location.href='${pageContext.request.contextPath}/student/search.html'"
					value="Öğrenci Arama"> </input></td>
			</tr>
			<tr>
				<td><input style="height: 30px; width: 250px" type="button"
					onclick="location.href='${pageContext.request.contextPath}/lesson/addLesson.html'"
					value="Ders Ekle"> </input></td>
			</tr>
			<tr>
				<td><input style="height: 30px; width: 250px" type="button"
					onclick="location.href='${pageContext.request.contextPath}/student/loadAjax.html'"
					value="Ajax Öğrenci Arama"> </input></td>
			</tr>
		</table>

	</form>


</body>
</html>
