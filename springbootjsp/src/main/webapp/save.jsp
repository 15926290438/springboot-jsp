<%--
  Created by IntelliJ IDEA.
  User: 79056
  Date: 2020/4/25
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
get请求：
<form action="/hello/save" method="get">
id:<input type="text" name="id">
    name:<input type="text" name="name">
    age:<input type="text" name="age">
<input type="submit">
</form>
--%>
<form action="/hello/save1" method="post">
    id:<input type="text" name="id">
    name:<input type="text" name="name">
    age:<input type="text" name="age">
    <input type="submit">
</form>
</body>
</html>
