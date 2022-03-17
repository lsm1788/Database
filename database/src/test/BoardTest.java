package test;

import java.util.Iterator;
import java.util.List;

import dao.BoardDAO;
import domain.BoardDTO;
import domain.BoardVO;

public class BoardTest {

	public static void main(String[] args) {
		//해당글 조회
		BoardVO vo = new BoardVO();
		vo.setBoard_id(2);
		BoardVO bvo = new BoardDAO().read(vo);
		
		if(bvo != null) {
			System.out.printf("%d\t %s\t %s\t %s\t %s\t %d\n", 
					bvo.getBoard_id(),
					bvo.getTitle(),
					bvo.getContent(),
					bvo.getWriter(),
					bvo.getRegdate(),
					bvo.getHit());
		} else {
			System.out.println("해당 글이 없습니다.");
		}
		
		//목록조회
//		BoardDTO bdto = new BoardDTO();
//		bdto.setSfl("title|content");	//title, content
//		bdto.setKeyword("목");
//		
//		BoardVO bvo = null;
//		List<BoardVO> list = new BoardDAO().read(bdto);
//		Iterator<BoardVO> it = list.iterator();
//		while(it.hasNext()) {
//			bvo = it.next();
//			System.out.printf("%d\t %s\t %s\t %s\t %d\n", 
//					bvo.getBoard_id(),
//					bvo.getTitle(),
//					bvo.getWriter(),
//					bvo.getRegdate(),
//					bvo.getHit());
//		}
		
		//글목록
//		BoardVO bvo = null;
//		List<BoardVO> list = new BoardDAO().read();
//		Iterator<BoardVO> it = list.iterator();
//		while(it.hasNext()) {
//			bvo = it.next();
//			System.out.printf("%d\t %s\t %s\t %s\t %d\n", 
//					bvo.getBoard_id(),
//					bvo.getTitle(),
//					bvo.getWriter(),
//					bvo.getRegdate(),
//					bvo.getHit());
//		}
		
//		글 등록
//		BoardVO bvo = new BoardVO();
//		bvo.setWriter("lsm1788");
//		bvo.setTitle("두번째 제목");
//		bvo.setContent("두번째 내용");
//		new BoardDAO().create(bvo);
		//System.out.println(bvo.toString());
	}

}
