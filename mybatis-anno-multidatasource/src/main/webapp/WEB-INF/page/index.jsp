<%--
  Created by IntelliJ IDEA.
  User: wby
  Date: 2019/5/3
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>使用注解实现多数据源</title>
</head>
<body>

<table>

    <c:forEach items="${roleList1}" var="role">
        <tr>
            <td>${role.id}</td> <td>${role.roleName}</td> <td>${role.note}</td><td>
            <a href="<c:url value='/getRole1?id=${role.id}'></c:url>">查看</a></td>
        </tr>
    </c:forEach>


</table>
<hr>
<table>

    <c:forEach items="${roleList2}" var="role">
        <tr>
            <td>${role.id}</td> <td>${role.roleName}</td> <td>${role.note}</td><td>
            <a href="<c:url value='/getRole2?id=${role.id}'></c:url>">查看</a></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
