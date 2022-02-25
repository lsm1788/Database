package practice;

/**
 * Exam5 객체의 속성과 메소드를 정의하시오.
 * 아래의 조건을 만족하세요.
 * 조건 : 아래주석 내용을 확인하시고 코딩하세요.
 * @author smart00
 *
 */
public class Exam5 {

	//5-1 전화번호를 저장하는 멤버변수[필드]를 생성하시오
	//접근지정자는 private으로 하시오.
	//변수명은 임의로 하시오.
	//여기 코딩 Start
	private String phoneNumber;
		
	
	//End
	
	//5-2 디폴트 생성자를 생성하시오.
	//여기 코딩 Start
		protected Exam5() {
		}
	//End
	
	//5-3 사용자 정의함수를 생성하시오.
	//메소드명 : myMethod
	//파라메터 : (String s, int i)
	//리턴 : 없음.
	//접근지정자 : public
	//여기 코딩 Start
	public void myMethod(String s, int i) {
	}
	//End

	
	//5-4 5-1의 전화번호를 GETXXX/SETXXX을 작성하시오.
	//여기 코딩 Start

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//End

}