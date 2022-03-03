package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import domain.SampleVO;
import util.DbUtil;

public class SampleDAO extends DbUtil {
	/*
	 * C:create() 등록하는 메소드
	 * 접근지정자 : public
	 * param : 등록될 값
	 * return : 없음
	 */
	public void create (SampleVO vo) {
		//코드작성
		StringBuffer sql = new StringBuffer();
		
		PreparedStatement stmt = null;
		Connection conn = null;
		
		sql.append("\n INSERT INTO sample ");
		sql.append("\n (strData, sampleDate) ");
		sql.append("\n VALUES (?, ?) ");
		int idx = 1;
		
		try {
			//DB연결
			conn = getConn();
			//prepareStatement(SQL작성 실행)
			stmt = conn.prepareStatement(sql.toString());
			
			//?에 값설정
			stmt.setString(idx++, vo.getStrData());
			stmt.setDate(idx++, new Date(vo.getSampleDate().getTime()));
			
			int res = stmt.executeUpdate();	//.executeUpdate <<-- 데이터 입력
			//결과처리(Select문만 ResultSet 객체 리턴)
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn, stmt, null);
		}
		//닫기
	}
	
	/*
	 * R:read() 조회하는 메소드
	 * 접근지정자 : public
	 * param : 조회할 값
	 * return : List
	 */
	public List read() {
		//코드작성
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM sample ");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<SampleVO> list = new ArrayList<SampleVO>();
		try {
		//DB연결
		conn = getConn();
		//prepareStatement(SQL작성 실행)
		stmt = conn.prepareStatement(sql.toString());
		rs = stmt.executeQuery();
		//결과처리(Select문만 ResultSet 객체 리턴)
		while(rs.next()) {
			list.add(
			new SampleVO(
			rs.getInt("num"),
			rs.getString("strData"),
			rs.getDate("sampleDate")
			)
			);
		}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn, stmt, rs);
		}
		//닫기
		return list;
	}
	
	public SampleVO read(SampleVO vo){
		//코드작성
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM sample WHERE num = ? ");
		
		Connection conn = null;
		PreparedStatement stmt = null;
		SampleVO sampleVo = null;
		ResultSet rs = null;
		try {
			//연결
			conn = getConn();
			//PreparedStatment (SQL문 + 실행)
			stmt = conn.prepareStatement(sql.toString());
			stmt.setInt(1, vo.getNum());
			rs = stmt.executeQuery();
			if(rs.next()) {
				sampleVo = new SampleVO(
						rs.getInt("num"),
						rs.getString("strData"),
						rs.getDate("sampleDate")
						);
			}
			//ResultSet 객체생성
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn, stmt, rs);
		}
		//닫기
		//코드작성 끝
		return sampleVo;
	}
	/*
	 * U:update() 수정하는 메소드
	 * 접근지정자 : public
	 * param : 수정될 값
	 * return : 없음
	 */
	public void update(SampleVO vo) {
		//코드작성
		StringBuffer sql = new StringBuffer();
		sql.append(" UPDATE sample ");
		sql.append(" SET strData = ? ");
		sql.append(" WHERE num = ? ");
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int idx = 0;
		
		try {
			//DB연결
			conn = getConn();
			//prepareStatement(SQL작성 실행)
			stmt = conn.prepareStatement(sql.toString());
			
			stmt.setString(++idx, vo.getStrData());
			stmt.setInt(++idx, vo.getNum());
			
			int res = stmt.executeUpdate();
			//결과처리(Select문만 ResultSet 객체 리턴)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn, stmt, null);
		}
		//닫기
	}
	
	/*
	 * D:delete() 삭제하는 메소드
	 * 접근지정자 : public
	 * param : 삭제될 키 값
	 * return : 없음
	 */
	public void delete(SampleVO vo) {
		//코드작성
		StringBuffer sql = new StringBuffer();
		sql.append("\n DELETE FROM sample WHERE num = ? ");		//삭제 명령어
		
		Connection conn = null;
		PreparedStatement stmt = null;
		//드라이버로드
		try {
		//DB연결
		conn = getConn();
		//prepareStatement(SQL작성 실행)
		stmt = conn.prepareStatement(sql.toString());
		
		stmt.setInt(1, vo.getNum());
		
		int res = stmt.executeUpdate();
		//결과처리(Select문만 ResultSet 객체 리턴)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn, stmt, null);
		}
		//닫기
	}
}
