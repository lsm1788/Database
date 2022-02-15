import java.util.Scanner;

/**
 * 엘리베이터 동작
 * 
 * @author smart04
 *
 */
public class ElevatorExam {

	public static void main(String[] args) throws InterruptedException {
		// 엘리베이터 객체 생성
		Elevator e = new Elevator();
		e.currFloor = 1;// 현재층
		e.floorMax = 4;// 최고층
		e.floorMin = 1;// 최저층
		e.weight = 550;// 제한무게
		e.nopsMax = 8;//8명

		//입력변수 선언 : 현재 있는 층
		Scanner scan = new Scanner(System.in);
		int menuNum = 0;
		
		System.out.println("현재 계신 층을 눌러주세요");
		
		//Switch문 시작==========================================
		switch (scan.next()) {
		case "1상":
			e.currFloor = 1;
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			
			break;
			
		default:
			break;
		}
		//Switch문 종료==========================================
		
		//while문 시작==========================================
		while (true) {
			System.out.println("=====메뉴선택====");
			System.out.println("1 : 엘리베이터 동작");
			System.out.println("2 : 엘리베이터 현재층");
			System.out.println("0 : 엘리베이터 종료");

			menuNum = scan.nextInt();

			switch (menuNum) {
			case 0: // 일반적으로 0번은 종료. 리부트는 6번
				System.exit(0);
				break;
			case 1: // 일반적으로 0번은 종료. 리부트는 6번
				System.out.println("탑승인원은 몇명입니까?");
				e.nops += scan.nextInt();
				if(e.nops > e.nopsMax) {
					System.out.println("미안합니다. 최씨성은 다 내리세요");
					Thread.sleep(1000);
				}
				System.out.println("1 : 이동할 층을 눌러주세요?");
				int finishFloor = scan.nextInt();// 숫자를 받는다.
				if(finishFloor <= e.floorMax && finishFloor >= e.floorMin) {
					System.out.println("현재 층은 " + e.currFloor);
					System.out.println("이동할 층은 " + finishFloor);
					if(e.currFloor < finishFloor) {
						e.upFloor(e.currFloor, finishFloor);
					} else if(e.currFloor > finishFloor){
						e.downFloor(e.currFloor, finishFloor);
					} 
					e.currFloor = finishFloor;
					
				}else {
					System.out.println("처음부터 다시 하세요");
				}
			case 2:
				System.out.println("현재 층은 " + e.currFloor);
				break;
			case 666:
				System.out.println("지옥, 지옥으로 갑니다.");
				for(int k = 0; k >= -666; k--) {
					System.out.println(k);
					Thread.sleep(5);
				}
				System.out.println("지옥에 어서오세요.");
				break;
			default:
				break;
			}

//			System.out.println("■ 이동할 층을 눌러주세요?");
//			int finishFloor = scan.nextInt();// 층 숫자를 받는다.
//			System.out.println("이동할 층은 " + finishFloor);

//			e.openDoor();// 문열고
//			e.closeDoor();// 문닫고
//			e.downFloor();// 한층 내려감
//			e.downFloor();// 한층 내려감
//			e.downFloor();// 한층 내려감. 1층도착
//			e.openDoor();// 문열고
//			e.closeDoor();// 문닫고

		}
		//while문 종료==========================================
	}
}
