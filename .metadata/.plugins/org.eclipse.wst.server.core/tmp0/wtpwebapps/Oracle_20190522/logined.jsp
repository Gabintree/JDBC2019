<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
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
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
	
	String sql = "select * from member where member_id = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	
	if(rs.next()){
		out.println("<table>");
		out.println("<tr><td>");
		out.println(id + "님 로그인을 환영합니다.");
		out.println("</td></tr>");
		out.println("<tr><td>");
		out.println("<a href = 'logout.jsp'><input type ='button' value='로그아웃'></a>");
		out.println("</td></tr>");
		out.println("</table>");
		
	}
%>

</body>
</html>