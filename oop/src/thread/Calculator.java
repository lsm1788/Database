package thread;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메소드 'synchronized'
	public synchronized void setMemory(int memory) {
		// 동기화 블록
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
}
