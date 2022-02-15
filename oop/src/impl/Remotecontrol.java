package impl;
/**
 * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
 *
 */
public interface Remotecontrol {	//인터페이스에서는 final 선언을 안해도 자동으로 선언된것으로 봄
	
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//추상메소드
	public void turnOn();			
	public void turnOff();			//abstract 를 선언을 안해도 선언된것으로 봄
	public void setVolume(int volume);
	//디폴트메소드
	
	//정적메소드
	
}
