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
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
	
	String sql = "insert into member values (?,?,?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	pstmt.setString(4, gender);
	pstmt.setString(5, email);
	
	pstmt.executeUpdate();
	
	out.println("작성하신 내용은 아래와 같습니다.");
	out.println("<table>");
	out.println("<tr><td>member_name</td><td>member_gender</td><td>member_id</td><td>member_email</td></tr>");
		out.println("<tr>");
		out.println("<td>" + name + "</td>");
		out.println("<td>" + gender + "</td>");
		out.println("<td>" + id + "</td>");
		out.println("<td>" + email + "</td>");
		out.println("</tr>");
		out.println("</table>");
%>

</body>
</html>