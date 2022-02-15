
public class Elevator {

	//필드
	int currFloor;//현재층
	int floorMax;//최고층
	int floorMin;//최저층
	boolean doorSW;//false면 닫힘, true면 열림.
	int lampSW;//false면 꺼짐, true면 켜짐.
	int weight;//무게
	int nops;//현재탑승인원
	int nopsMax;//최대탑승인원
	
	//메소드
	//void로 작성하고 돌려받을 게 있으면 수정해주면 된다.
	//ex)문이 닫히면서 "감사합니다.(음성출력)"
	void openDoor() throws InterruptedException {
		System.out.println("문열림(1초)");
		Thread.sleep(1000);//문열리는 시간 1초 설정
	}
	void closeDoor() throws InterruptedException {
		System.out.println("문닫힘(1초)");
		Thread.sleep(1000);//문닫히는 시간 1초 설정
	}
	void downFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("내려갑니다.(1초)");
		for(int i = currFloor; i >= finishFloor; i--) {
			System.out.println(i);
			Thread.sleep(1000);//한층 내려가는 시간 1초 설정
		}
		nops = 0; //인원초기화
	}
	void upFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("올라갑니다.(1초)");
		for(int i = currFloor; i <= finishFloor; i++) {
			System.out.println(i);
			Thread.sleep(1000);//한층 올라가는 시간 1초 설정
		}
		nops = 0; //인원초기화
	}
	void buttonCtl() {
		System.out.println("버튼 콘트롤");
	}
	public void displayMenu() {
		// TODO Auto-generated method stub
		
	}
	
}
