
public class Const {

	static int a; //a는 공통된 메모리(static)로 설정해라.
	//new라는 객체를 만들지 않아도 static은 미리 만들어져있다.
	// String 대문자 주의
	String b;

	// 디폴트생성자 void
	// 생성자들은 Class에 대한 Field를 초기화 시키는 목적으로 종종 사용된다.
	// Web에서는 생성자를 잘 이용하지 않고 Get/Set를 주로 사용한다.
	public Const() {
		// 재귀호출 : 자기자신호출
		// this(10, "abc");//다른 생성자를 호출할 때
//		System.out.println("아래 다른 생성자호출에 에러가 납니다.");
		this("abc", 10);// 다른 생성자를 호출할 때, this를 좌클릭하면 이동
		System.out.println("에러가 발생하니 생성자 호출은 반드시 위에 적어주세요.");
		// Ctrl + 마우스 왼쪽클릭 this를 하면 해당하는 곳으로 이동한다.
	}

	public Const(int a, String b) {
		// this 자기자신이다.
		this.a = a;
		this.b = b;
	}

	// 오버로딩 : 상단과 갯수가 똑같은데 타입이 다름
	// 장점 : 함수명을 하나로 사용하면서 다양하게 사용할 수 있다.
	public Const(String b, int a) {
		this.a = a;
		this.b = b;
	}

	public Const(int a) {
		this.a = a;
	}

	// 오버로딩 : 상단과 갯수는 동일하지만 타입이 다름
	// 장점 : 함수명을 하나로 사용하면서 다양하게 사용할 수 있다.
	public Const(String b) {
		this.b = b;
	}

	// 출력하는데 메소드 명을 계속 주면 수량이 많을 때 힘들다
	// static을 선언하면
	static void print(int i) {
		System.out.println("출력값 INT : " + i);
	}

	void print(double i) {
		System.out.println("출력값 DOUBLE : " + i);
	}

	void print(String i) {
		System.out.println("출력값 STRING : " + i);
	}

	public void print(int i, double d, String s) {
		/*
		 * ==, equals, instanceof 오버로딩 : 같은 함수명을 사용한다. 매개변수의 수가 다르거나, 타입이 다르면 사용할 수 있다.
		 * 매개변수의 수가 같으면 타입의 순서가 다르면 사용할 수 있다. 
		 * print(int i, double d, String s)
		 * print(String s, double d, int i) o 
		 * print(int i, double d, String s) x
		 */
//		if(Integer.valueOf(i) instanceof Integer) {
//			print(i);
//		}
//		if(Double.valueOf(d) instanceof Double) {
//			print(d);
//		}
//		if(s instanceof String) {
//			print(s);
//		}
		print(i);
		print(d);
		print(s);
	}

//	public Const() {
//	}
//
//	// 컨트롤키 눌러보면 해당 위치로 가서 확인이 가능하다
//	// 생성자의 이름은 필드 이름과 동일하게 준다
//	// 하지만 a = a; 가 되면 위쪽으로 갈 수가 없기때문에
//	// this.a = a;로 해줘서 위쪽으로 갈 수 있게 해준다.
//	public Const(int a, String b) {
//		this.a = a;
//		this.b = b;
//	}

}
