<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
<h3>안전하게 로그아웃 되었습니다. 이용해주셔서 감사합니다.</h3>
<hr>
<h3>다시 로그인 하시려면</h3>

<%
	pageContext.include("chap10_login.jsp");
%>

<hr>
<a href = "chap10_login.jsp"><input type ="button" value ="첫 화면으로"></a>
</body>
</html>