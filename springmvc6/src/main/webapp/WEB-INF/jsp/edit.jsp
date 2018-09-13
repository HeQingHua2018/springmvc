<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改更新</title>
</head>
<body>
<form:form action="update" method="post" modelAttribute="admin">
    <form:hidden path="id"/>
    <form:input path="username"/>
    <form:input path="password"/>
    <input type="submit" value="提交更新"/>
</form:form>
</body>
</html>
