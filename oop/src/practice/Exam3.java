package practice;

/**
 * Exam3 임의의 두수를 지정하고 두수의 연산자를 구한후 결과값을 출력하시오.
 * 아래의 조건을 만족하세요.
 * 조건 : 아래 에러난 코드를 수정하시오.
 * @author smart00
 *
 */
public class Exam3 {

	public int method(String string, int i, int j) {
		return i+j;
		//End
	}

	public static void main(String[] args) {
		int res = new Exam3().method("+", 2, 3);
		System.out.println("2 + 3 = "+res);
	}

}