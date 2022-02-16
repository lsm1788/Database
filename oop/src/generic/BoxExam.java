package generic;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String msg = box1.get();
		System.out.println(msg);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		Integer msg2 = box2.get();
		System.out.println(msg2);
	}

}
