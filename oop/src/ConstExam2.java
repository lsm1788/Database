import java.awt.Color;

public class ConstExam2 {

	public static void main(String[] args) {
		// static은 프로그램이 가동과 동시에 메모리에 미리 다 올라와있다.
		// static, stack(heap으로 참조), heap(안보여), method

		// new 생성자();
//		Const c = new Const(); 
		//static int a로 선언하면 속성에 바로 접근가능하다.
//		Const c2 = new Const(10, "abc");
		
		Const.a = 10; // 공통된 메모리(a)에 10을 넣는다.
		Const.a = 20; // 공통된 메모리(a)에 20을 넣는다. 덮어씌워짐.
		
		//static선언된 애들은
		//className.속성 or className.method 사용
		Const.print(0);
		System.out.println(Color.white);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		System.out.println(Math.random());
		
	}
}