<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC PreparedStatement</title>
</head>
<body>

<%
	Connection conn = null;	
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC", "jspbook", "1111");

		pstmt = conn.prepareStatement("select * from student where department_id = ? and student_id like?");
			
		pstmt.setString(1, "m001");
		pstmt.setString(2, "2014%");
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			out.println(rs.getString(1) + "|");
			out.println(rs.getString(2) + "|");
			out.println(rs.getString(3) + "|");
			out.println(rs.getString(4) + "|");
			out.println(rs.getString(5) + "<br>");
		}
	}
		catch (SQLException e) {
			out.println(e.getMessage());
		}finally{
			if(pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
			if(conn != null) try { conn.close(); } catch (SQLException e) {}
		}
	
	

%>



</body>
</html>