package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class Simple7JDBCDAO {

	public static void main(String[] args) {
		String paramVarchar = "varcharTestUpdate";
		
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		String sql = " UPDATE exam SET varcharTest = ? WHERE 1 ";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 2. DB연결(DriverManager.getConnetion())
			conn = DriverManager.getConnection(url, user, password);
			// 3. SQL문작성(Statement, PreparedStatement)
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, paramVarchar);
			
			// 4. SQL문실행(Select문 만 executeQuery(), executeUpdata())
			int res = stmt.executeUpdate();
			if(res > 0) {
				System.out.println(res+"개의 행이 수정되었습니다.");
			} else {
				System.out.println("수정실패했습니다.");
			}
			// 5. Select문 만 ResultSet 객체를 반환한다.
			// 나머진 int를 반환한다.
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6. 닫기(close))
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

	}
	
}
