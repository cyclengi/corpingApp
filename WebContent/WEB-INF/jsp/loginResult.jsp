<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/CSS/normalize.css" />" >
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" >
<title>コーピング管理アプリ</title>
</head>
<body>
	<header>
		<h1><a href="/corpingApp/servlet/MainServlet">コーピングアップ！ (α)</a></h1>
		<nav>
			
		</nav>
	</header>


	<h1>コーピング管理ログイン</h1>

	<c:choose>
		<c:when test="${not empty sessionScope.loginUser }">
			<p>ログインに成功しました</p>
			<p>ようこそ${sessionScope.loginUser.name }さん</p>
			<a href="/corpingApp/servlet/MainServlet">コーピングの閲覧・管理へ</a>
		</c:when>
		<c:otherwise>
			<p>ログインに失敗しました</p>
			<a href="/corpingApp/">TOPへ</a>
		</c:otherwise>
	</c:choose>

	<footer>
        <p><small>&copy; Cyclengi 2020</small></p>
    </footer>

</body>
</html>