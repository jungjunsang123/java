<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 화면
<a href="home.do">홈으로 가기</a><br>
<form action="register.do" method="post">
<input type="text" name="memberId"  required="required" placeholder="아이디"><br>
<input type="password" name="memberPassword"  required="required" placeholder="비밀번호"><br>
<input type="text" name="memberName" placeholder="이름"><br>
<input type="text" name="memberAdd" placeholder="주소"><br>
<input type="submit" value="가입">
</form>

</body>
</html>