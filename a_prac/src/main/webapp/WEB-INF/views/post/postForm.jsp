<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포스트 폼 페이지</title>
</head>
<body>
<form action="registerPost.do" method="post">
제목<input type="text" name="bTitle" required="required" placeholder="제목"><br>
내용<textarea cols="90" rows="15" name="bContent" required="required" placeholder="본문내용을 입력하세요"></textarea><br>
<input type="submit" value="작성">
</form>
</body>
</html>