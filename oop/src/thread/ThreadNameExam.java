package thread;

public class ThreadNameExam extends Thread {

	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(5);
		System.out.println("프로그램 시작 스레드이름: " + mainThread.getName());

		Thread ta = new ThreadA();
		System.out.println("작업 스레드 이름: " + ta.getName());
		ta.start();

		Thread tb = new ThreadB();
		System.out.println("작업 스레드 이름: " + tb.getName());
		tb.start();
	}

}