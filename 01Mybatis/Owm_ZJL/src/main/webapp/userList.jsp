<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<%@ page import="java.util.*"%> //获取系统时间必须导入的
<%@ page import="java.text.*"%> //获取系统时间必须导入的


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
    <header class="publicHeader">
        <h1>超市账单管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
            <a href="login.html">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
        <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>
<!--主体内容-->
    <section class="publicMian ">
        <div class="left">
            <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
            <nav>
                <ul class="list">
                    <li><a href="billList.html">账单管理</a></li>
                    <li><a href="providerList.html">供应商管理</a></li>
                    <li  id="active"><a href="<%=path%>/SmbmsUserServlet?action=userList">用户管理</a></li>
                    <li><a href="password.html">密码修改</a></li>
                    <li><a href="login.html">退出系统</a></li>
                </ul>
            </nav>
        </div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>用户管理页面</span>
            </div>
            <div class="search" >
                <span>用户名：</span>
                <form action="/SmbmsUserServlet?action=userLikeList" method="post">
                <input type="text" placeholder="请输入用户名" name="uname" />
                <input  type="submit" value="查询"/>
                </form>
                <a href="userAdd.jsp">添加用户</a>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">用户编码</th>
                    <th width="20%">用户名称</th>
                    <th width="10%">性别</th>
                    <th width="10%">年龄</th>
                    <th width="10%">电话</th>
                    <th width="10%">用户类型</th>
                    <th width="30%">操作</th>
                </tr>



                <c:forEach items="${page.list}" var="item">

                <tr>
                    <%--<td hidden ><a name="userid" >${item.id}</a></td>--%>
                    <c:set var="ueid" value="${item.id}"></c:set>
                    <td>${item.userCode}</td>
                    <td>${item.userName}</td>
                    <td>${item.gender==1?'男':'女'}</td>

                    <td>${item.age}</td>
                    <td>${item.phone}</td>
                    <td>
                        <c:choose>

                            <c:when test="${item.userType == 1}">
                                管理员
                            </c:when>
                            <c:when test="${item.userType == 2}">
                                经理
                            </c:when>
                            <c:when test="${item.userType == 3}">
                                普通用户
                            </c:when>
                            <c:otherwise>
                                普通用户
                            </c:otherwise>

                        </c:choose>

                    </td>
                    <td>
                        <a href="userView.html"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="<%=path%>/SmbmsUserServlet?action=userUpdate&udid=${item.id}"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="<%=path%>/SmbmsUserServlet?action=userdel&userid=${item.id}" class="<%--removeUser--%>"><img src="img/schu.png" alt="删除"  title="删除"/></a>
                    </td>

                </tr>

                </c:forEach>





            </table>
            <td> <li><a >总页数：[${page.getPageIndex()}/${page.getTotalpages()}]</a></li></td>
           <a href="<%=path%>/SmbmsUserServlet?action=userList&pageIndex=${page.getPageIndex()-1}">上一页</a>
            <a href="<%=path%>/SmbmsUserServlet?action=userList&pageIndex=${page.getPageIndex()+1}">下一页</a>

        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
   <%-- <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>

            <a href="<%=path%>/SmbmsUserServlet?action=userdel&userid=${ueid}" id="yes">确定</a>
            <a href="<%=path%>/SmbmsUserServlet?action=userList" id="no">取消</a>
        </div>
    </div>--%>
</div>

    <footer class="footer">
        版权归北大青鸟
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>