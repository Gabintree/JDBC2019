<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
 	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
		
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
	
	String sql = "insert into chap10_member values (?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
		
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	
	pstmt.executeUpdate();
 %>
 
 	<h3>작성하신 내용은 아래와 같습니다.</h3>
 	
 	이름 : <%=name %>
 	<hr>
 	아이디 : <%= id %>
	<hr>
	<a href = "chap10_login.jsp"><input type ="button" value="로그인 화면으로"></a>
</body>
</html>