<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	request.setCharacterEncoding("utf-8");
 	String id = request.getParameter("id");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
		
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
	
	String sql = "delete from chap10_member where member_id = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
		
	pstmt.setString(1, id);
	
	pstmt.executeUpdate();
	
	
%>

<h3>이용해주셔서 감사합니다. 안녕히가세요.</h3>
</body>
</html>