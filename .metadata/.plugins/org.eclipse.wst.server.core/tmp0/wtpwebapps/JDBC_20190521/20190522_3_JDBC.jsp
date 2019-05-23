<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC PreparedStatment</title>
</head>
<body>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	int rowNum;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC", "jspbook", "1111");
		
		pstmt = conn.prepareStatement("insert into student values (?, ?, ?, ?, ?)");

		pstmt.setString(1, "20140007");
		pstmt.setString(2, "김연아");
		pstmt.setString(3, "yunakim@email.com");
		pstmt.setString(4, "010-006-0006");
		pstmt.setString(5, "m001");
		
		rowNum = pstmt.executeUpdate();
		
		out.println(rowNum + "개의 행이 삽입되었습니다." + "<hr>");
	} catch (SQLException e) {
			out.println(e.getMessage());
	} finally {
		try{
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			out.println(e.getMessage());
	}
	}
	%>
	
		<a href="http://localhost:8181/JDBC20190521_0/20190522_0_JDBC.jsp">결과확인</a>


</body>
</html>