package thread;

public class PriorityExam {

	public static void main(String[] args) {

		for(int i = 1; i <=10; i++) {
			Thread t = new CalcThread("스레드" + i);
			if(i != 10) {
				t.setPriority(Thread.MIN_PRIORITY);
			} else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
		
	}

}
