<%-- 
    Document   : contact
    Created on : 30/09/2013, 00:10:04
    Author     : Marcio Ballem
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Spring MVC and Ajax : Contact</title>

        <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

        <script src="<c:url value="/resources/js/contact_student.js"/>"></script>

    </head>
    <body>
        <div id="container">
            <h2>Find Contact By Name</h2>
            <div>
                <label for="firstInput">Adı</label>
                <input type="text" name="name" id="firstInput"/>
            </div>
            <div>
                <label for="lastInput">Okulu</label>
                <input type="text" name="school" id="lastInput"/>
            </div>
            <div id="theJson"></div>
            <button type="button" id="button">Find</button>

            <h2>Submit new Contact</h2>
            <form id="saveStudent">
                <div>
                    <label for="nameInput">Adı: </label>
                    <input type="text" name="name" id="nameInput" />
                </div>
                <div>
                    <label for="schoolInput">Okulu: </label>
                    <input type="text" name="school" id="schoolInput"  />
                </div>
                <div>
                    <label for="studentIdInput">Okul Numarası: </label>
                    <input type="text" name="studentId" id="studentIdInput" />
                </div>

                <div><input id="submit" type="submit" value="Öğrenciyi Kaydet"></div>
            </form>

            <br><br>
            <h2>Table Contact</h2>
            <table id="contactTableResponse" class="table tr">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>School</th>
                        <th>StudentId</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th scope="row">Spring-Ajax</th>
                        <td colspan="4">JQuery Ajax</td>
                    </tr>
                </tfoot>
                <tbody>
                    <c:forEach items="${students}" var="student">
                        <tr>
                            <td>${student.id}</td>
                            <td>${student.name}</td>
                            <td>${student.school}</td>
                            <td>${student.schoolId}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <a href="${pageContext.request.contextPath}/student/loadAjax">JQuery By Load Method</a>
    </body>
</html>
