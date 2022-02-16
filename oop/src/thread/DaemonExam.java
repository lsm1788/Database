package thread;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true);	//메인스레드가 종료될때 자식스레드도 같이 종료
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료");
	}

}
