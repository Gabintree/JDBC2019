<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<style>
table, tr, td{
border : 1px solid black;
}
</style>
</head>
<body>
<a href = "index.jsp">첫 화면</a>
<a href = "login.jsp">로그인</a>
<a href = "join.jsp">회원가입</a>
<hr>
<h3>아이디와 비밀번호를 입력하십시오.</h3>
<hr>
<form action = "logined.jsp"  method = "post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type ="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type ="text" name="pw"></td>
		</tr>
		<tr>
			<td colspan="2" style = "text-align: right;">
			<input type="checkbox" value="아이디저장">아이디 저장
			</td>
		</tr>
		<tr>
			<td colspan="2" style = "text-align: right;"><a href = "chap10_join.jsp">[회원가입]</a> <input type="submit" value="로그인"></td>
		
		</tr>
	</table>
		
</form>

</body>
</html>