
public class Singleton {

	
	private static Singleton singleton = new Singleton();
	//private : 외부에서 접근이 불가능하다. 메소드 호출만 가능.
	private Singleton() {}
	//private : 외부에서 접근이 불가능하다. 메소드 호출만 가능.
	
	static Singleton getInstance() {
		return singleton;
		
	}
	
}
