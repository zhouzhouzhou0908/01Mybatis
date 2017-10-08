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

<table border="1">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>点播次数</td>
        <td>评论次数</td>
    </tr>

<c:forEach items="${page.list}" var="item">
        <tr>
            <td>${item.newsid}</td>
            <td><a href="inser.jsp">${item.newstitle}</a></td>
            <td>${item.clickCount}</td>
            <td>评论次数</td>
        </tr>
</c:forEach>
</table>
<td> <li><a>${page.getPageIndex()}</a></li></td>
<a href="<%=path%>/newsServlet?action=list&pageIndex=${page.getPageIndex()-1}">上一页</a>
<a href="<%=path%>/newsServlet?action=list&pageIndex=${page.getPageIndex()+1}">下一页</a>




</body>
</html>
