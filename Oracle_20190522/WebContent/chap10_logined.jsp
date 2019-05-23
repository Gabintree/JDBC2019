<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<style>
table, tr, td {
border : 1px solid black;
}
</style>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
	
	String sql = "select member_id from chap10_member where member_id = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	


 if(rs.next()){
	 if(pw.equals(rs.getString(1))){
 %>	 
	<table>
		<tr>
			<td><%= id%>님 로그인을 환영합니다.</td>
		</tr>
		<tr>
			<td style = 'text-align : right'>
				
				<a href="chap10_logout.jsp"><input type ="submit" value="로그아웃"></a>
			</td>
		</tr>
	</table>
	<form action = "chap10_delete.jsp" method ="post">
		<input type ="hidden"	name="id" value="<%= id %>">
		<input type = "submit" value="탈퇴">
	</form>
<% 
 	} else {
		out.println("<script>alert('비밀번호가 일치하지 않습니다.'); location.href('chap10_login.jsp');</script>");	 
	}
 }
 
%>	

</body>
</html>