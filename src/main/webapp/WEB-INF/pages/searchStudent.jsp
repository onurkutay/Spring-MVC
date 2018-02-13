<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Öğrenci Arama Sayfası</title>
</head>
<body>
	<center>
		<h1>Öğrenci Arama Sayfası</h1>
		<p>Aramak istediğiniz öğrenci numarasını buraya giriniz.</p>
		<form:form method="POST">
			<div class="row">
				<div class="small-3 columns">
					<input type="text" id="txt" name="searchString">
				</div>

				<div class="small-6 columns end">
					<button id="button-id" type="submit">Öğrenci Bilgilerini
						Getir</button>
				</div>

			</div>
		</form:form>

	</center>
	<p align="center">
		<a href="${pageContext.request.contextPath}/index.html">Ana Menü</a>
	</p>
</body>

</html>
