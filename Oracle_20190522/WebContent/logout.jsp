<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<h3>안전하게 로그아웃 되었습니다. 이용해주셔서 감사합니다.</h3>
<hr>
<h3>다시 로그인 하시려면<br>아이디와 비밀번호를 입력하십시오.</h3>
<%
	pageContext.include("login.jsp");
%>
</body>
</html>