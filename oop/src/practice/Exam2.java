package practice;

/**
 * Exam2 1부터 100까지 합을 구하시오. 아래의 조건을 만족하세요. 
 * 조건 : 결과값[출력값] "홀수합:XX, 짝수합:XX,총합:5050"
 * 
 * @author smart00
 *
 */
public class Exam2 {

	private void onTo100() {
		// 여기에 코딩하세요. Start
		int i = 0;
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				sum += i;
			} else if(i%2 == 0) {
				sum2 += i;
			}
			sum3 += i;
		}

		System.out.println("홀수합:"+sum+", 짝수합:"+sum2+", 총합:"+sum3);
		// End
	}

	public static void main(String[] args) {
		new Exam2().onTo100();
	}
}