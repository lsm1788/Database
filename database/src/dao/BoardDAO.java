package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.BoardDTO;
import domain.BoardVO;

public class BoardDAO {
	
	private String url = "jdbc:mysql://localhost:3306/kblab?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
	private String user = "root";
	private String password = "smart";
	
	public void create(BoardVO vo) {
		
		StringBuffer query = new StringBuffer();
		Connection conn = null;
		PreparedStatement  stmt = null;
		query.append(" INSERT INTO board ");
		query.append(" (board_id,writer,title,content,regdate,hit) ");
		query.append(" values (null, ?, ?, ?, now(), 0) ");
		String sql = query.toString();
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결
			conn = DriverManager.getConnection(url, user, password);
			// SQL 명령어작성 및 실행
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getWriter());
			stmt.setString(2, vo.getTitle());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				} catch (Exception e) {
				}
		}		
	}
	
	public List<BoardVO> read() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO bvo = null;
		StringBuffer query = new StringBuffer();
		query.append(" SELECT b.board_id, b.title, m.uname as writer, b.regdate, b.hit "); 
		query.append(" FROM board as b ");
		query.append(" LEFT JOIN member as m ");
		query.append(" ON b.writer = m.id ");
		query.append(" ORDER BY b.regdate DESC; ");
		String sql = query.toString();
		try {
		// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결
			conn = DriverManager.getConnection(url, user, password);
			// SQL 명령어작성 및 실행
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				bvo = new BoardVO();
				bvo.setBoard_id(rs.getInt("board_id"));
				bvo.setWriter(rs.getString("writer"));
				bvo.setTitle(rs.getString("title"));
				bvo.setRegdate(rs.getTimestamp("regdate"));
				bvo.setHit(rs.getInt("hit"));
				list.add(bvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	
	public List<BoardVO> read(BoardDTO dto) {
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO bvo = null;
		
		StringBuffer query = new StringBuffer();
		query.append(" SELECT b.board_id, b.title, m.uname as writer, b.regdate, b.hit ");
		query.append(" FROM board as b ");
		query.append(" LEFT JOIN member as m ");
		query.append(" ON b.writer = m.id ");
		if("title".equals(dto.getSfl())) {
			query.append(" WHERE b.title LIKE ? ");
		}
		if("content".equals(dto.getSfl())) {
			query.append(" WHERE b.content LIKE ? ");			
		}
		if("title|content".equals(dto.getSfl())) {
			query.append(" WHERE b.title LIKE ? OR b.content LIKE ? ");			
		}
		query.append(" ORDER BY b.regdate DESC ");
		String sql = query.toString();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int idx = 1;
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결
			conn = DriverManager.getConnection(url, user, password);
			// SQL 명령어작성 및 실행
			stmt = conn.prepareStatement(sql);
			if("title".equals(dto.getSfl())) {
				stmt.setString(idx++, "%"+dto.getKeyword()+"%");
			}
			if("content".equals(dto.getSfl())) {
				stmt.setString(idx++, "%"+dto.getKeyword()+"%");
			}
			if("title|content".equals(dto.getSfl())) {
				stmt.setString(idx++, "%"+dto.getKeyword()+"%");
				stmt.setString(idx++, "%"+dto.getKeyword()+"%");
			}
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				bvo = new BoardVO();
				bvo.setBoard_id(rs.getInt("board_id"));
				bvo.setWriter(rs.getString("writer"));
				bvo.setTitle(rs.getString("title"));
				bvo.setRegdate(rs.getTimestamp("regdate"));
				bvo.setHit(rs.getInt("hit"));
				list.add(bvo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
	}
		return list;
}
	
	public BoardVO read(BoardVO bvo) {
		BoardVO vo = null;
		StringBuffer query = new StringBuffer();
		query.append(" SELECT b.board_id, b.title, b.content, m.uname as writer, b.regdate, b.hit ");
		query.append(" FROM board as b ");
		query.append(" LEFT JOIN member as m ");
		query.append(" ON b.writer = m.id ");
		query.append(" WHERE b.board_id = ? ");
		
		String sql = query.toString();
			
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB연결
			conn = DriverManager.getConnection(url, user, password);
			// SQL 명령어작성 및 실행
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, bvo.getBoard_id());
			rs = stmt.executeQuery();
			if(rs.next()) {
				vo = new BoardVO();
				vo.setBoard_id(rs.getInt("board_id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));
				vo.setHit(rs.getInt("hit"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
	}
		return vo;
}
}
