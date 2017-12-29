<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 25.12.2017
  Time: 4:14
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
    <a href="index.html"><img src="shapka.png" width="480"></a>

    <div class="form-row">
        <form method="post" action="${pageContext.request.contextPath}/uploadFile"
              enctype="multipart/form-data">

            Select file to upload:
            <br />
            <input type="file" name="file"  />
            <br />
            <input type="file" name="file" />
            <br />
            Description:
            <br />
            <input type="text" name="description" size="100" />
            <br />
            <br />
            <input type="submit" value="Upload" />
        </form>
    </div>
</header>
</body>
</html>