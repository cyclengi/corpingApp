<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/CSS/logonStyle.css" />" >
<title>新規ユーザー登録</title>
</head>
<body>

<h1>新規ユーザー登録</h1>

<form action="/corpingApp/servlet/SignUpServlet" method="post">
	<dl>
		<dt>お名前</dt>
		<dd>
			<input type="text" name="name" required placeholder="鈴木　太郎">
		</dd>
		<dt>ユーザーID（ログイン時に使用）</dt>
		<dd>
			<input type="text" name="userId" required placeholder="user1234">
		</dd>
		<dt>パスワード（ログイン時に使用）</dt>
		<dd>
			<input type="password" name="pass" required placeholder="password1234">
		</dd>
		<dt>メールアドレス</dt>
		<dd>
			<input type="email" name="mail" required placeholder="tarou@email.com">
		</dd>
		<dt>性別</dt>
		<dd>
			<input type="radio" name="sex" value="1">男
			<input type="radio" name="sex" value="2">女
		</dd>
		<dt>敬称</dt>
		<dd>
			<select name="honorific">
				<option value="様">様</option>
				<option value="殿">殿</option>
				<option value="さん">さん</option>
				<option value="ちゃん">ちゃん</option>
				<option value="君">君</option>
				<option value="氏">氏</option>
				<option value="女史">女史</option>
				<option value="卿">卿</option>
				<option value="陛下">陛下</option>
				<option value="閣下">閣下</option>
			</select>
		</dd>
	</dl>
	<p class="submit"><input type="submit" value="送信する"><input type="reset" value="クリア"></p>
</form>

</body>
</html>