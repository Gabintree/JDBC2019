<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oracle 데이터베이스 연결</title>
<style>
 table, tr, td {
 
 border : 1px solid black; 
 border-collapse: collapse;  

}
</style>
</head>
<body>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");

	String sql = "select * from student order by department_id desc";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();
	
	out.println("<table>");
	out.println("<tr><td>STUDENT_ID</td><td>STUDENT_NAME</td><td>STUDENT_EMAIL</td><td>STUDENT_TEL</td><td>DEPARTMENT_ID</td></tr>");
	while (rs.next()) {
		out.println("<tr>");
		out.println("<td>" + rs.getString(1) + "</td>");
		out.println("<td>" + rs.getString(2) + "</td>");
		out.println("<td>" + rs.getString(3) + "</td>");
		out.println("<td>" + rs.getString(4) + "</td>");
		out.println("<td>" + rs.getString(5) + "</td>");
		out.println("</tr>");
	}
	out.println("</table>");
	
%>
</body>
</html>