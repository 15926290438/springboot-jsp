<%--
  Created by IntelliJ IDEA.
  User: 79056
  Date: 2020/4/26
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello/update" method="post">
    <%--
    注意不要忘了name属性。往服务器提交表单的时候，key都是name属性的值。
    --%>
    id:<input type="text" value="${stu.id}" name="id" readonly><br>
    name:<input type="text" name="name" value="${stu.name}"><br>
    age:<input type="text" name="age" value="${stu.age}">
    <input type="submit">
</form>
</body>
</html>
