/**
 * 스마트폰 메소드
 * 
 * @author smart04
 *
 */
public class SmartPhone {
	// 멤버변수
	String caseColor;// 폰케이스색상
	String cameraPixel;// 카메라화소
	String lcdSize;// 화면 크기
	String modelName;// 모델명
	String phoneNumber;// 전화번호
	//String는 참조형이므로 Null로 다 초기화가 되어있다.

	//멤버메소드
	//디폴트 생성자
	//Ctrl키 누르고 SmartPhone를 누르면 해당 메소드로 이동한다.
	//사용하든 안하든 디폴트 생성자를 만들어두는 것을 권장한다. 미생성시 에러발생 우려.
	public SmartPhone() {
		System.out.println("디폴트 생성자를 호출했어요.\n디폴트 생성자를 먼저 수행해요.");
	}
	
	
	public SmartPhone(
			String caseColor, 
			String cameraPixel, 
			String lcdSize, 
			String modelName, 
			String phoneNumber) {
		
		this.caseColor = caseColor;
		this.cameraPixel = cameraPixel;
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}





	// 멤버메소드
	/**
	 * 사진을 찍다
	 */
	void takingPictures() {
		System.out.println("사진을 찍다. 찰칵찰칵!");
	}

	/**
	 * 전화걸기
	 * @param toPhoneNumber
	 */
	void makeACall(String toPhoneNumber) {
		System.out.println(toPhoneNumber + " 번호로 전화를 건다.띠로리띠로리~♬");
	}

	/**
	 * 앱실행
	 * @param appName
	 */
	void playApp(String appName) {
		System.out.println(appName + "앱을 실행한다. 짜잔!");

	}
}
