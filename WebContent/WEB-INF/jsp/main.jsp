<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/CSS/normalize.css" />" >
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" >
<title>コーピング管理アプリ</title>
</head>
<body class="home">

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
			<h1>コーピングアップ！ (α)メイン</h1>
			<p class="username"><c:out value="${loginUser.name}" />さん、ログイン中</p>
		</div>

		<div class="inner">
			<c:forEach var="corping" items="${corpingList }">
				<div class="nested">
					<c:forEach var="s" items="${fn:split(corping.text, '
					')}">
						<p>${s}</p>
					</c:forEach>
					<p><c:out value="${corping.tag1 }" />　<c:out value="${corping.tag2 }" />　<c:out value="${corping.tag3 }" /></p>
				</div>
			</c:forEach>

		</div>
	</main>

	<footer>
        <p><small>&copy; Cyclengi 2020</small></p>
    </footer>

	
</body>
</html>