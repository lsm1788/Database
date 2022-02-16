package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultExam {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		System.out.println("[작업처리요청]");
		Callable<Integer> task = new Callable<Integer>() {
		
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		Future<Integer> future = es.submit(task);
		
		try {
			int sum = future.get();
			System.out.println("[처리결과]"+sum);
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		es.shutdown();
	}

}
