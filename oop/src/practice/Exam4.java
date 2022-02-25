package practice;
import java.util.Arrays;
import java.util.Random;

/**
 * Exam4 배열을 생성한후 배열에 들어있는 값을 오름차순으로 정렬하시오.
 * 아래의 조건을 만족하세요.
 * 조건 : 오름차순으로 출력하시오.
 * 예 : 5, 0, 3, 4, 0 => 0, 0, 3, 4, 5

 * @author smart00
 *
 */
public class Exam4 {

	public void method(int [] iArr) {
		//여기에 코딩하세요. Start
		Arrays.sort(iArr);
			
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]+", ");
		}	
		//End		
	}

	public static void main(String[] args) {
		//5칸의 정수 배열생성
		int [] iArr = new int[5];
		//임의의값을 배열에 저장
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = new Random().nextInt(10);
		}
		//method 호출
		new Exam4().method(iArr);
	}

}