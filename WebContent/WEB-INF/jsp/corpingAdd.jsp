<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/CSS/normalize.css" />" >
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" >
<title>新規コーピング追加</title>
</head>
<body class="corpingAdd">

	<header>
		<h1><a href="/corpingApp/servlet/MainServlet">コーピングアップ！ (α)</a></h1>
		<nav>
			<ul>
				<li><a href="/corpingApp/servlet/MainServlet">TOPへ</a></li>
				<li><a href="/corpingApp/servlet/CorpingSearchServlet">コーピング検索</a></li>
				<li><a href="/corpingApp/servlet/CorpingAddServlet">コーピング登録</a></li>
				<li><a href="/corpingApp/servlet/LogoutServlet">ログアウト</a></li>
			</ul>
		</nav>
    </header>
    
    <main>
		<div class="title">
			<h1>コーピング追加</h1>
			<p class="username"><c:out value="${loginUser.name}" />さん、ログイン中</p>
		</div>

		<div class="inner">
			<form action="/corpingApp/servlet/CorpingAddServlet" method="post">
                <p>
                コーピング内容：<br>
                <textarea name="text" rows="8" cols="40"></textarea>
                </p>
                <p>
                タグを追加<br>
                タグ１：<input type="text" name="tag1" size="10"> タグ２：<input type="text" name="tag2" size="10"> タグ３：<input type="text" name="tag3" size="10">
                </p>
            
                <p>
                <input type="submit" value="送信">　　<input type="reset" value="リセット">
                </p>
            </form>

		</div>
	</main>

    

    <footer>
        <p><small>&copy; Cyclengi 2020</small></p>
    </footer>


</body>
</html>