<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class = "nav">
    <a href="registration.jsp"><img src="anonymous.png"></a>
    <a><img src="heart.png"> НУ И ТУТ ТИПА 100500 ЛОЙСОВ </a>

    <form method="get" action="/search" target="_blank" style="margin-left: 1000px;">
        <input name="q" id="form-query" value="" placeholder="поиск по сайту">
        <input src="eye.png" type="image" style="vertical-align: bottom; padding: 0;"/>
    </form>
</div>
    <div style="float: right; padding: 10px; text-align: right;">

        <!-- User store in session with attribute: loginedUser -->
        Hello <b>${loginedUser.userName}</b>
        <br/>
        Search <input name="search">

    </div>

</div>
