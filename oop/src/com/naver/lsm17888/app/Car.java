package com.naver.lsm17888.app;


public class Car {

	static Tire t1;
	Tire t2;
	
	public Car() {
		t1 = new HankookTire();
		t2 = new KumhoTire();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.t1.getInch());
		System.out.println(Car.t1.getInch());
		//com.hankook.Tire tire = new com.hankook.Tire();
		//Tire tire = new Tire();		//위의 방식과 의미는 동일
		
	}
}
