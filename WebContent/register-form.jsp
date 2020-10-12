<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
회원가입 폼
<form action="front2" method="post">
<input type="hidden" value="register" name="command">
이름<input type="text" name="name" required="required"><br>
주소<input type="text" name="address" required="required"><br>
아이디<input type="text" name="id" required="required"><br>
비밀번호<input type="password" name="password" required="required"><br>
<input type="submit" value="가입">
</form>
</div>
</body>
</html>