<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, tr, td{
border : 1px solid black;
}
</style>
</head>
<body>
<%
	boolean login = false;
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String logout = request.getParameter("logout");
	
	
	if(id!=null &&pw!=null){
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC", "root", "1111");
		String sql = "select user_pw from user where user_id = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, id);


	
	
		ResultSet rs = pstmt.executeQuery();
	
		if(rs.next()) {
			if(pw.equals(rs.getString(1))){
				login=true;
			}else {
				out.println("<script>alert('비밀번호가 일치하지 않습니다.');</script>");	
			}
		}else {
			out.println("<script>alert('아이디가 존재하지 않습니다.');</script>");
		}
	}
	
	if(logout != null && logout.equals("logout")){
		login = false;
	}
	
	if(login==false){
		
	
%>

<h3>아이디와 비밀번호를 입력하십시오.</h3>
<hr>
<form action = "chap10_01_LoginForm.jsp"  method = "post">
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
			<td colspan="2" style = "text-align: right;"><a href = "#">[회원가입]</a> <input type="submit" value="로그인"></td>
		
		</tr>
	</table>
		
</form>
<%
	}else{
		
	

%>
<form action = chap10_01_LoginForm.jsp method="post">
<input type = "hidden" name="logout" value="logout">
<table>
	<tr>
		<td><%= id %>님 로그인을 환영합니다.</td>
	</tr>
	<tr>
		<td style = "text-align: right;"><input type="submit" value="로그아웃"></td>
	</tr>
</table>
</form>
<%
	}
%>
</body>
</html>