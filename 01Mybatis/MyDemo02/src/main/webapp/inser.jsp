<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<h2>154512</h2>

<table>
    <c:forEach items="${talk}" var="item">


    <tr>
        <td>${item.Content}</td>
        <td>${item.Talktime}</td>
    </tr>
    </c:forEach>
</table>




</body>
</html>
