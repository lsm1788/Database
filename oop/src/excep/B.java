package excep;

public class B {

	public void throwMethod() {
		A a = new A();
		try {
			a.throwMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B");
	}

}
