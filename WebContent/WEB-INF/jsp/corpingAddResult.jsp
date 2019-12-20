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

<p>
<c:out value="${requestScope.msg}" />
</p>

<p>
<a href="/corpingApp/servlet/MainServlet">TOPへ</a>
</p>

</body>
</html>