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
<h2>Hello World???????!</h2>
<h1>sssss</h1>

<form action="/newsServlet?action=list" method="post">
    <input  type="submit" value="查询"/>
</form>






</body>
</html>
