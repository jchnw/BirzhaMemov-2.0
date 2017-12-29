<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Биржа Мемов</title>
    <link rel="stylesheet" href="MainStyle.css">

</head>

<body>

<header>
    <a href="index.html"><img src="shapka.png" width="480"></a>
</header>


<jsp:include page="_nav.jsp"></jsp:include>



<div class = "side">
    <ul class = "menu">
        <li class="menu__list"><a href="#">Бояны</a>
            <ul class="menu__drop">
                <li><a href="15_1.html">пятнадцатый год</a></li>
                <li><a href="15_2.html">пятнадцатый год</a></li>
                <li><a href="15_3.html">пятнадцатый год</a></li>
                <li><a href="15_4.html">ЭТО ВАЖНО</a></li>
            </ul>
        </li>

        <li>
            <a href="#">Вложить лукасы</a>
        </li>

        <li class="menu__list"><a href="#">Котеровки</a>
            <ul class="menu__drop">
                <li><a href="kot_1.html">На сегодня</a></li>
                <li><a href="kot_2.html">За последние три дня</a></li>
                <li><a href="kot_3.html">Очень хорошие котеровки</a></li>
            </ul>
        </li>

        <li class="menu__list"><a href="#">Вывести лукасы</a>
            <ul class="menu__drop">
                <li><a href="#">1) вопервых что ты мне сделаеш</a></li>
                <li><a href="#">я в другом городе</a></li>
                <li><a href="#">за мат извени</a></li>
            </ul>
        </li>

        <li class="menu__list"><a href="#">Запостить мем</a>
            <ul class="menu__drop">
                <li><a href="zduki.jsp">Мои здюки</a></li>
                <li><a href="notb.jsp">Пока не боян</a></li>
                <li><a href="upload.jsp">Я твою мамку эчпочмак</a></li>
            </ul>
        </li>
    </ul>
</div>






<main>
    <article>
        <div><center><p>МЕМ НЕДЕЛИ <br><br>
            <img src="week.jpg"><br><br><br>
            А ВОТ ЗДЕСЬ БУДЕТ НАША МЕМОГРАММА <br> НО ЭТО УЖЕ СОВСЕМ ДРУГАЯ ИСТОРИЯ</center>

        </div>
    </article>
    <aside>
    </aside>
</main>
</body>
</html>
