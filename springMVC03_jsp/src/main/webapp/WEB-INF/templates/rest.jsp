<%--
  Created by IntelliJ IDEA.
  User: hairong
  Date: 2022/6/27
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rest风格</title>
</head>
<body>
    <h1>rest风格</h1>

    <h4>发送GET请求</h4>
    <a href="${pageContext.request.contextPath}/user/1">GET</a>

    <h4>发送POST请求</h4>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <input type="submit" value="POST"/>
    </form>

    <h4>发送PUT请求</h4>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <input type="hidden" name="_method" value="PUT"/>
        <input type="submit" value="PUT"/>
    </form>

    <h4>发送DELETE请求</h4>
    <input type="hidden" name="_method" value="DELETE"/>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <input type="hidden" name="_method" value="DELETE"/>
        <input type="submit" value="DELETE">
    </form>
</body>
</html>
