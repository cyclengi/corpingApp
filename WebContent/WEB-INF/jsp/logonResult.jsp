<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録結果</title>
</head>
<body>

<!-- <header>部分からメニューを削除　ログインチェック関連により -->


<p>
<c:out value="${requestScope.msg}" />
</p>

<p>
<a href="/corpingApp/">ログイン画面へ</a>
</p>

</body>
</html>