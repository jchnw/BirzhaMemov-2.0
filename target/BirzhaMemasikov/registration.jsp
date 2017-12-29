<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 25.12.2017
  Time: 4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Биржа Мемов</title>
    <link rel="stylesheet" href="MainStyle.css">

</head>


<body>

<header>
    <a href="/"><img src="shapka.png" width="480"></a>
</header>
<form method='post' action="${pageContext.request.contextPath}/registration">

    <div class='form-row'>
        <label>Meme Name:</label>
        <input type="text" name="login" value="${users.login}"><br />
    </div>

    <div class='form-row'>
        <label>Password: </label>
        <input type="password" name="password" value="${users.password}">
    </div>

    <div class="form-row">
        <input type="submit" value= "Войти/зарегистрироваться" />
        <a href="/forgetpassword.html">Забыл?</a>
    </div>

</form>
</body>
</html>