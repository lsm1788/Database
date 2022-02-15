import java.sql.Date;
//다른 디렉토리의 명령을 가져올 때 사용
//java.util 디렉토리(패키지)의 Date 클래스를 가져와라
//java.sql 디렉토리(패키지)의 Date 클래스를 가져와라
//Ctrl + 클릭하면 해당 명령의 결과물을 알 수 있음

public class Test {

	public static void main(String[] args) {
//		// 년-월-일
//		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
//		//1번 패키지와 클래스를 같이 쓰는 방법
		
		//2번 import를 쓰는 방법(권장.편하다.클릭클릭끝)
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println(date);
		//한파일 내에 같은 이름의 클래스를 사용할 때 1번 방법으로 패키지와 클래스를 같이 써서 구현.
		//한파일 내에 같은 이름의 클래스를 사용하면 에러발생.
		
		//java.util.(앞부분은 디렉토리(패키지) 경로)Date(클래스)
		java.util.Date date2 = new java.util.Date(System.currentTimeMillis());
		
		System.out.println(date2);
		
	}

}
