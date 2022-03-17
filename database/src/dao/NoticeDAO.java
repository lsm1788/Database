package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.NoticeVO;

public class NoticeDAO {

	public void create(NoticeVO vo) {
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		
		StringBuffer sql = new StringBuffer();
		PreparedStatement stmt = null;
		Connection conn = null;
		
		sql.append("\n INSERT INTO notice ");
		sql.append("\n (title, content, inputDate) ");
		sql.append("\n VALUES (?, ?, ?) ");
		
		int idx = 1;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(sql.toString());
			
			stmt.setString(idx++, vo.getTitle());
			stmt.setString(idx++, vo.getContent());
			stmt.setTimestamp(idx++, vo.getInputDate());
			
			int res = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn != null) conn.close();
					if(stmt != null) stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}	
	}
	
	public List<NoticeVO> read() {
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		
		StringBuffer sql = new StringBuffer();
		PreparedStatement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		
		sql.append(" SELECT * FROM notice ");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(sql.toString());
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				list.add(
				new NoticeVO(
				rs.getInt("no"),
				rs.getString("title"),
				rs.getString("content"),
				rs.getTimestamp("inputDate")
				)
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
}
