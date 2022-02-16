package thread;

public class StatePrintThread extends Thread{
	//필드
	private Thread targetThread;
	
	//생성자
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	//메소드
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 :" + state);
			//스레드가 생성되면 start
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			//스레드가 종료되면 반복을 멈춰라
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}




}
