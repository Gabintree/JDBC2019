<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

Class.forName("com.mysql.cj.jdbc.Driver");

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC", "jspbook", "1111");
Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery("select * from student");

rs.next();

while ( rs.next()) {
	
	out.println(rs.getString(1) + "|");
	out.println(rs.getString(2) + "|");
	out.println(rs.getString(3) + "|");
	out.println(rs.getString(4) + "|");
	out.println(rs.getString(5) + "<br>");
	
}

	rs.close();
	stmt.close();
	conn.close();

%>)

</body>
</html>