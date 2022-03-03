//package practiceDAO;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import domain.SampleVO;
//
//
//public class PracticeDAO {
//
//	public void crate(PracticeVO vo) {
//		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
//		String user = "root";
//		String password = "smart";
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		StringBuffer sql = new StringBuffer();
//		
//		sql.append("\n INSERT INTO sample");
//		sql.append("\n (strData, sampleDate) ");
//		sql.append("\n VALUES (?, ?) ");
//		
//		int idx = 1;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//			stmt = conn.prepareStatement(sql.toString());
//			
//			stmt.setString(idx++, vo.getStrData());
//			stmt.setDate(idx++, new Date(vo.getSimpleDate().getTime()));
//			
//			int res = stmt.executeUpdate();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//				try {
//					if(conn != null) conn.close();
//					if(stmt != null) stmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}
//	
//	public List read() {
//		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
//		String user = "root";
//		String password = "smart";
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		StringBuffer sql = new StringBuffer();
//		sql.append(" SELECT * FROM sample ");
//		ResultSet rs = null;
//		List<SampleVO> list = new ArrayList<SampleVO>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//			stmt = conn.prepareStatement(sql.toString());
//			rs = stmt.executeQuery();
//			
//			while(rs.next()) {
//				list.add(new SampleVO(
//						rs.getInt("num"), 
//						rs.getString("strData"), 
//						rs.getDate("smapleDate")
//						)
//						);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//				try {
//					if(conn != null) conn.close();
//					if(stmt != null) stmt.close();
//					if(rs != null)rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//		return list;
//	}
//	
//	public SampleVO read(SampleVO vo) {
//		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
//		String user = "root";
//		String password = "smart";
//		
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		StringBuffer sql = new StringBuffer();
//		sql.append("SELECT * FROM sample WHERE num = ? ");
//		SampleVO sampleVo = null;
//		ResultSet rs = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//			stmt = conn.prepareStatement(sql.toString());
//			stmt.setInt(1, vo.getNum());
//			rs = stmt.executeQuery();
//			if(rs.next()) {
//				sampleVo = new SampleVO(
//						rs.getInt("num"), 
//						rs.getString("strData"),
//						rs.getDate("sampleDate")
//						);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			}
//				catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		return sampleVo;
//	}
//	
//	public void update(SampleVO vo) {
//		String url = "jdbc.mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
//		String user = "root";
//		String password = "smart";
//		
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		StringBuffer sql = new StringBuffer();
//		sql.append(" UPDATE sample ");
//		sql.append(" SET strData = ? ");
//		sql.append(" WHERE num = ? ");
//		
//		int idx = 1;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//			stmt = conn.prepareStatement(sql.toString());
//			stmt.setString(idx++, vo.getStrData());
//			stmt.setInt(idx++, vo.getNum());
//			
//			int res = stmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public void delete(SampleVO vo) {
//		String url = "jdbc.mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Aisa/Seoul";
//		String user = "root";
//		String password = "smart";
//		
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		StringBuffer sql = new StringBuffer();
//		sql.append("\n DELETE FROM sample WHERE num = ? ");
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//			stmt = conn.prepareStatement(sql.toString());
//			stmt.setInt(1, vo.getNum());
//			
//			int res = stmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
