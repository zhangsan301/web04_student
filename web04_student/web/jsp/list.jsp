<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/8/30
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学生信息显示页面</h1>
<table border="1" width="600">
   <tr>
       <td>学生编号</td>
       <td>学生姓名</td>
       <td>学生性别</td>
       <td>学生年龄</td>
   </tr>
    <c:forEach var="student" items="${ list }">
    <tr>
        <td>${ student.sid }</td>
        <td>${ student.sname }</td>
        <td>${ student.sex }</td>
        <td>${ student.age }</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
