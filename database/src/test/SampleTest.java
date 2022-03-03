package test;

import java.util.Date;

import dao.SampleDAO;
import domain.SampleVO;

public class SampleTest {

	public static void main(String[] args) {
		
		SampleDAO dao = new SampleDAO();
		SampleVO createVo = new SampleVO(0, "str문자", new Date());
		
		//데이터 생성
		dao.create(createVo);		
//		System.out.println(createVo);
		
		//Exam 테이블의 전체 데이터를 조회한다.
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
		
		
		//num컬럼이 n번인 데이터만 가지고 오기
//		SampleVO vo2 = new SampleVO();
//		vo2.setNum(1);
//		SampleVO sampleVO = dao.read(vo2);
//		
//		if(sampleVO != null) {
//		System.out.print(sampleVO.getNum()+"\t");
//		System.out.print(sampleVO.getStrData()+"\t");
//		System.out.print(sampleVO.getSampleDate()+"\t");
//		}
		//num컬럼이 n번인 데이터만 가지고 왔습니다
		
		
		//num컬럼이 n번인 데이터를 수정합니다.
//		SampleVO updateVo = new SampleVO();
//		updateVo.setNum(1);
//		updateVo.setStrData("수정된문자");
//		dao.update(updateVo);
		//num컬럼이 n번인 데이터를 수정했습니다

		
		//num컬럼이 n번인 데이터를 삭제합니다
//		SampleVO deleteVo = new SampleVO();
//		deleteVo.setNum(1);
//		dao.delete(deleteVo);
		//num컬럼이 n번인 데이터를 삭제했습니다
		
	}
}
