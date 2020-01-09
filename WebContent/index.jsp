<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/CSS/normalize.css" />" >
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" >
<title>コーピング管理アプリログイン</title>
</head>
<body class="index">
    <header>
		<h1><a href="/corpingApp/servlet/MainServlet">コーピングアップ！</a></h1>
		<nav>
			
		</nav>
	</header>

	<main>
		<div class="title">
			<h1>コーピングアップ！</h1>
			
		</div>

		<div class="inner">
			<form action="/corpingApp/servlet/LoginServlet" method="post">
                ユーザー名：<input type="text" name="userId"><br>
                パスワード：<input type="password" name="pass"><br>
                <input type="submit" value="ログイン">
            </form>
                
            <p>新規ユーザ登録は<a href="/corpingApp/servlet/SignUpServlet">こちら</a></p>
                
		</div>
	</main>

	<footer>
        <p><small>&copy; Cyclengi 2020</small></p>
    </footer>

</body>
</html>