<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 신청서</title>
<style>
table, tr, td{
border : 1px solid black;
}
</style>
</head>
<body>
	<form action ="chap10_joined.jsp" method="post">
		<table>
			<tr>
			<td>아이디</td><td><input type ="text" name="id"></td>
			</tr>
			<tr>
			<td>비밀번호</td><td><input type ="password" name="pw"></td>
			</tr>
			<tr>
			<td>이름</td><td><input type ="text" name="name"></td>
			</tr>
			<tr>
			<td colspan = "2" style = 'text-align : right'><input type ="submit" value="회원가입완료"></td>
			</tr>
		</table>
	</form>
</body>
</html>