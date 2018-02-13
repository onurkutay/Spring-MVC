<%-- 
    Document   : table
    Created on : 30/09/2013, 01:10:38
    Author     : Marcio Ballem
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Spring MVC and Ajax : Contact</title>

    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

    <script src="<c:url value="/resources/js/contact_student.js"/>"></script>


</head>
<body>
<div id="container">
    <h2>Öğrenci Arama</h2>

    <label for="search">Öğrencinin İsmini giriniz:</label>
    <input type="text" id="search" name="search">
    <div id="info"></div>
    <table id="loadTable" class="table tr">
        <thead>
        <tr>
            <th>ID</th>
            <th>Adı</th>
            <th>Okulu</th>
            <th>Okul Numarası</th>
        </tr>
        </thead>
        <tbody id="tbody">
        <jsp:include page="searchStudentAjax.jsp"/>
        </tbody>
    </table>
</div>
</body>
</html>