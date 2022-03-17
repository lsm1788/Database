package test;

import dao.MemberDAO;
import domain.MemberVO;

public class MemberTest {

	public static void main(String[] args) {
		MemberVO mvo = new MemberVO();
		mvo.setId("seknfo3ew");
		mvo.setPw("****");
		mvo.setUname("이승목");
//		System.out.println(mvo);
		new MemberDAO().create(mvo);
		
	}

}
