package board.model;

import java.sql.*;
import java.util.ArrayList;
//import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAO {
	DataSource ds;
	public static final int WRITING_PER_PAGE = 10;
	
	public BoardDAO() {
		try {
			//Context context = new InitialContext();
			//ds = (DataSource) context.lookup("java:comp/env/jdbc/Board");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		// 게시판 목록 조회 기능 수행
	public ArrayList<BoardDTO> boardList(String curPage) {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		  
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
			//conn = ds.getConnection();
			String sql ="SELECT num, name, password, subject, content, write_date, write_time, ref, step, lev, read_cnt, child_cnt";
			
			sql += " FROM BOARD ORDER BY ref desc, step asc";
			//sql += "LIMIT ?, ?";
	
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, WRITING_PER_PAGE * (Integer.parseInt(curPage)-1));
			//pstmt.setInt(2, WRITING_PER_PAGE);
	
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String subject = rs.getString("subject");
				String content = rs.getString("content");
				Date writeDate = rs.getDate("write_date");
				Time writeTime = rs.getTime("write_time");
				int ref = rs.getInt("ref");
				int step = rs.getInt("step");
				int lev = rs.getInt("lev");
				int readCnt = rs.getInt("read_cnt");
				int childCnt = rs.getInt("child_cnt");
				 
				BoardDTO writing = new BoardDTO();
				writing.setNum(num);
				writing.setName(name);
				writing.setPassword(password);
				writing.setSubject(subject);
				writing.setContent(content);
				writing.setWriteDate(writeDate);
				writing.setWriteTime(writeTime);
				writing.setRef(ref);
				writing.setStep(step);
				writing.setLev(lev);
				writing.setReadCnt(readCnt);
				writing.setChildCnt(childCnt);
		
				list.add(writing);
			}
			
			

		} catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e){
				e.printStackTrace();                                                                      
			}
		}
		return list;
    }
	// 게시판의 페이징 처리를 위한 기능 수행
	
	public int boardPageCnt() {
		int pageCnt = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
	try {
		//conn = ds.getConnection();
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1111");
		String sql = "SELECT COUNT (*) AS num FROM BOARD";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		if (rs.next()) {
			pageCnt = rs.getInt("num") / WRITING_PER_PAGE + 1;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn != null) conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return pageCnt;
   }
 }
