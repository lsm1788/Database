package test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.SampleDAO;
import domain.SampleVO;

public class SampleTest {

	public static void main(String[] args) {
		SampleDAO dao = new SampleDAO();
		//Exam 테이블의 전체 데이터를 조회한다.
		SampleVO createVo = new SampleVO(0, "가변폭문자열", new Date());
//		
//		List<SampleVO> list = dao.read();
//		Iterator<SampleVO> it = list.iterator();
//		while(it.hasNext()) {
//			SampleVO vo = it.next();
//			System.out.print(vo.getNum()+"\t");
//			System.out.print(vo.getStrData()+"\t");
//			System.out.print(vo.getSampleDate()+"\t");
//			System.out.println();
//		}
		//Exam 테이블의 전체 데이터를 조회했습니다.
		
//		System.out.println(createVo);
		dao.create(createVo);
		
		//num컬럼이 2번인 데이터만 가지고 오기
//		SampleVO readVo = new SampleVO();
//		readVo.setNum(2);
//		SampleVO readVoRes = dao.read(readVo);
//		
//		if(readVoRes != null) {
//		System.out.print(readVoRes.getNum()+"\t");
//		System.out.print(readVoRes.getStrData()+"\t");
//		System.out.print(readVoRes.getSampleDate()+"\t");
//		}
//		//num컬럼이 2번인 데이터만 가지고 왔습니다
		
		//num컬럼이 2번인 데이터를 수정합니다.
//		SampleVO updateVo = new SampleVO();
//		updateVo.setNum(2);
//		updateVo.setStrData("바꿀값");
//		dao.update(updateVo);
		//num컬럼이 2번인 데이터를 수정했습니다
		
		//num컬럼이 2번인 데이터를 삭제합니다
//		SampleVO deleteVo = new SampleVO();
//		deleteVo.setNum(2);
//		dao.delete(deleteVo);
		//num컬럼이 2번인 데이터를 삭제했습니다
		
	}

}
