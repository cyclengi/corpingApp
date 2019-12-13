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
<h1>コーピング管理アプリ　メイン</h1>
<p>
<c:out value="${loginUser.name}" />さん、ログイン中
</p>


<p>
<a href="/corpingApp/servlet/MainServlet">TOPへ</a>
</p>

<p>
<a href="/corpingApp/servlet/CorpingSerchServlet">コーピング検索</a>
</p>

<p>
<a href="/corpingApp/servlet/CorpingAddServlet">新規コーピング登録</a>
</p>

<p>
<a href="/corpingApp/servlet/LogoutServlet">ログアウト</a>
</p>

<c:forEach var="corping" items="${corpingList }">
	<p><c:out value="${corpingList.text }" /></p>
	<p>タグ１：<c:out value="${corpingList.tag1 }" />　タグ２：<c:out value="${corpingList.tag2 }" />　タグ３：<c:out value="${corpingList.tag3 }" /></p>
	<hr>
</c:forEach>


</body>
</html>