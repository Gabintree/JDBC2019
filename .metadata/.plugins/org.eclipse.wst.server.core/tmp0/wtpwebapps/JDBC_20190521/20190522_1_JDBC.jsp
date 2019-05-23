<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC Insert</title>
</head>
<body>
<%

Connection conn = null;
Statement stmt = null;

int rowNum;

try{
	Class.forName("com.mysql.jdbc.Driver");
	
	conn = DriverManager.getConnection("jdbc:mysql://lovalhost:3306/jspbook?serverTimezone=UTC", "jspbook", "1111");	

	stmt = conn.createStatement();
	
	rowNum = stmt.executeUpdate("insert into student (student_id, student_name, student_email, student_tel, department_id) " + " values ('20140006', '김연아', 'yunakim@email.com', '010-006-0006', 'm001')");

	out.println(rowNum + "개의 행이 삽입되었습니다." + "<hr/>");
}catch (SQLException e) {
	
}finally{
	if(stmt != null) try{ stmt.close();} catch (SQLException e) {}
	if(conn != null) try{ conn.close();} catch (SQLException e) {}
}
%>


<a href="http://localhost:8181/JDBC20190521_0/20190522_0_JDBC.jsp">결과확인</a>


</body>
</html>