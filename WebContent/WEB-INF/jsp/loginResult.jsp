<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーピング管理アプリ</title>
</head>
<body>
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

</body>
</html>