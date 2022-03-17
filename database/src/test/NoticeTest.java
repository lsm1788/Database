package test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import dao.NoticeDAO;
import domain.NoticeVO;

public class NoticeTest {

	public static void main(String[] args) {
		NoticeDAO dao = new NoticeDAO();
		NoticeVO creatVo = new NoticeVO(0, "제목", "내용", new Timestamp(System.currentTimeMillis()));
		
		//Create
		dao.create(creatVo);
		
		//Read
		List<NoticeVO> list = dao.read();
		Iterator<NoticeVO> it = list.iterator();
		while(it.hasNext()) {
			NoticeVO vo = it.next();
			System.out.print(vo.getNo()+"\t");
			System.out.print(vo.getTitle()+"\t");
			System.out.print(vo.getContent()+"\t");
			System.out.print(vo.getInputDate()+"\t");
			System.out.println();
		}
		
	}

}
