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

    <p>
    <c:out value="${requestScope.msg}" />
    </p>

    <p>
    <a href="/corpingApp/servlet/MainServlet">TOPへ</a>
	</p>
	
	<footer>
        <p><small>&copy; Cyclengi 2020</small></p>
    </footer>

</body>
</html>