
public class ConstExam {

	public static void main(String[] args) {
		//static은 프로그램이 가동과 동시에 메모리에 미리 다 올라와있다.
		//static, stack(heap으로 참조), heap(안보여), method
		
		// new 생성자();
		Const c = new Const();
		Const c2 = new Const(10, "abc");
		c.a = 10; //공통된 메모리(a)에 10을 넣는다.
		c2.a = 20; //공통된 메모리(a)에 20을 넣는다. 덮어씌워짐.
		System.out.println(c.a);
		System.out.println(c2.a);
		
		//Create 디폴트 생성자를 하면 상단에 에러가 발생한다.
		new Const(10, "abc");

		print(); //이것은 static 영역에 들어있는 print()이다.
//		c.print(10);
//		c.print(10.1);
//		c.print("Hi");
		c.print(10, 10.1, "Hi");
		
		
	}

	private static void print() {
		//static 같은 영역에 들어가 있어야 print()를 호출해서 사용할 수 있다.
	}
	
}
