package practice;
/**
 * Exam1 피보나치 수열을 구하시오.
 * 아래의 조건을 만족하세요.
 * 조건 : 0을 제외한 총 5번 반복하면서 값을 출력하시오.
 * 결과값 : 1 1 2 3 5
 * @author smart00
 *
 */
public class Exam1 {

	private void fibonacci() {
		//여기에 코딩하세요. Start
		int i = 1;
		int j = 1;
		int k;
		
		System.out.print(i+" ");
		System.out.print(j+" ");
		
		for(int i1=1; i1 <=3; i1++) {
			k = i+j;
			System.out.print(k+" ");
			i=j;
			j=k;
		}
		
		//End		
	}

	public static void main(String[] args) {
		new Exam1().fibonacci();
	}

}