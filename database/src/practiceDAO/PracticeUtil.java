//package practiceDAO;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class PracticeUtil {
//
//	public Connection getconn() {
//		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
//		String user = "root";
//		String password = "smart";
//		Connection conn = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return conn;
//		
//	}
//	
//	public void dbClose() {
//		
//	}
//}
