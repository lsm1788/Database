
public class CarExam {

	public static void main(String[] args) {
		
		//Car 클래스 객체 car를 생성하시오.
		// car객체 생성
		Car car = new Car();
		Car car2 = new Car();
		
		//setXX를 이용하여 값을 설정하시오.
		//모델네임 설정
		car.setModelName("스파크");
		car2.setModelName("그렌저");
		//get & set는 잘못된 값을 검출할 수 있다.
		car.setSpeed(-100);
		car2.setSpeed(300);
		
		//getXXX를 이용하여 값을 출력하시오.
		System.out.println("차량이름은 " + car.getModelName());
		System.out.println("차량속도는 " + car.getSpeed() + " km/h");
		System.out.println("차량이름은 " + car2.getModelName());
		System.out.println("차량속도는 " + car2.getSpeed() + " km/h");


	}

}
