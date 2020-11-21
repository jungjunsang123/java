<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<c:choose>
<c:when test="${sessionScope.mvo==null }">
<form action="login.do" method="post">
아이디 <input type="text" placeholder="아이디" name="memberId"><br>
아이디 <input type="password" placeholder="비밀번호" name="memberPassword"><br>
<input type="submit" value="로그인">
</form>
<a href="registerForm.do">회원가입하기</a>
</c:when>
<c:otherwise>
${sessionScope.mvo.memberName}님 로그인 하셨습니다.
<a href="home.do">홈으로 가기</a><br>

</c:otherwise>
</c:choose>
<br>
<a href="postForm.do">글쓰러 가기</a>
<a href="postList.do">글목록보러가기</a>



</body>
</html>
