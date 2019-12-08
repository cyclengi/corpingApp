<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規コーピング追加</title>
</head>
<body>

<h1>新規コーピング追加</h1>

<p>
<a href="/corpingApp/servlet/Main">TOPへ</a>
</p>

<form action="/corpingApp/servlet/CorpingAddServlet" method="post">
<p>
コーピング内容：<br>
<textarea name="text" rows="8" cols="40"></textarea>
</p>
<p>
タグを追加<br>
タグ１：<input type="text" name="tag1" size="10"> タグ２：<input type="text" name="tag2" size="10"> タグ３：<input type="text" name="tag3" size="10">
</p>

<p>
<input type="submit" value="送信"><input type="reset" value="リセット">
</p>
</form>


</body>
</html>