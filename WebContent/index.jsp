<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーピング管理アプリログイン</title>
</head>
<body>
<h1>コーピング管理アプリへようこそ</h1>

<form action="/corpingApp/servlet/LoginServlet" method="post">
ユーザー名：<input type="text" name="userId"><br>
パスワード：<input type="password" name="pass"><br>
<input type="submit" value="ログイン">
</form>

<p>新規ユーザ登録は<a href="/corpingApp/servlet/SignUpServlet">こちら</a></p>


</body>
</html>