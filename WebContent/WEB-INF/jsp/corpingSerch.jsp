<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーピング検索</title>
</head>
<body>

<h1>コーピング検索</h1>

<p>
<a href="/corpingApp/servlet/MainServlet">TOPへ</a>
</p>

<form action="/corpingApp/servlet/CorpingSerchServlet" method="post">
<h2>テキスト内容からコーピングを検索：</h2>
<p>
<input type="text" name="text" size="10">
</p>

<p>
<input type="submit" value="送信">　　<input type="reset" value="リセット">
</p>
</form>


<form action="/corpingApp/servlet/CorpingSerchServlet" method="post">

<h2>タグからコーピングを検索</h2>
<p>
タグ１：<input type="text" name="tag1" size="10"> タグ２：<input type="text" name="tag2" size="10"> タグ３：<input type="text" name="tag3" size="10">
</p>

<p>
<input type="submit" value="送信">　　<input type="reset" value="リセット">
</p>
</form>



</body>
</html>