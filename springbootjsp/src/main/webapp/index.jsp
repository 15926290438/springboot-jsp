<%--
  Created by IntelliJ IDEA.
  User: 79056
  Date: 2020/4/25
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>  <%--没有这个，el表达式会不生效--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/hello/saveJsp">增加</a>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="item" varStatus="a">
        <tr>
            <%--
            varStatus="a" 中a对象记录当前循环次数和角标
            a.index --当前循环所在的角标
            a.count--当前循环的次数
            --%>
            <td>${item.id}--${a.count}</td>
            <td>${item.name}-- ${a.count}</td>
            <td>${item.age}</td>
           <td><a href="/hello/delete/${item.id}">删除</a></td>
            <td><a href="/hello/findById/${item.id}">修改</a></td>
        </tr>
    </c:forEach>

    </tbody>


</table>
</body>
</html>
