package thread;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < Long.MAX_VALUE; i++) {}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (long i = 0; i < Long.MAX_VALUE; i++) {
		}
	}

}
