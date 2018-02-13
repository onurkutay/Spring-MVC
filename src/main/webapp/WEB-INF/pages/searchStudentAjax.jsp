<%-- 
    Document   : search
    Created on : 30/09/2013, 01:13:52
    Author     : Marcio Ballem
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${students}" var="student">
    <tr id="tr_${student.id}">
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.school}</td>
        <td>${student.studentId}</td>
    </tr>
</c:forEach>
