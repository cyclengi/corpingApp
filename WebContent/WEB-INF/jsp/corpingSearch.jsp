<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/CSS/normalize.css" />" >
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" >
<title>コーピング検索</title>
</head>
<body class="corpingSearch">
	<header>
		<h1><a href="/corpingApp/servlet/MainServlet">コーピングアップ！</a></h1>
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
			<h1>コーピング検索</h1>
			<p class="username"><c:out value="${loginUser.name}" />さん、ログイン中</p>
		</div>

		<div class="inner">
            <form action="/corpingApp/servlet/CorpingSearchServlet" method="post">
                <h2>テキスト内容からコーピングを検索：</h2>
                <p>
                <input type="text" name="text" size="30">
                </p>
            
                <p>
                <input type="submit" value="送信">　　<input type="reset" value="リセット">
                </p>
            </form>
            
            <form action="/corpingApp/servlet/CorpingSearchServlet" method="post">
            
                <h2>タグからコーピングを検索</h2>
                <p>
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