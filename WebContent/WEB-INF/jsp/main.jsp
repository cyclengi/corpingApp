<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーピング管理アプリ</title>
</head>
<body>

<!-- main div class="header"にする -->
<h1>コーピング管理アプリ　メイン</h1>
<p>
<c:out value="${loginUser.name}" />さん、ログイン中
</p>

<!-- headerにする -->
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

<!-- 
	main div class="inner"にする
	コーピング１つごと＝１ループごとにDIVで分割。DIVにclassを与えて管理。
 -->
<c:forEach var="corping" items="${corpingList }">
	<p>
	<c:forEach var="s" items="${fn:split(corping.text, '
	')}">
	    <div>${s}</div>
	</c:forEach>

	</p>
	<p>タグ１：<c:out value="${corping.tag1 }" />　タグ２：<c:out value="${corping.tag2 }" />　タグ３：<c:out value="${corping.tag3 }" /></p>
	<hr>
</c:forEach>

</body>
</html>