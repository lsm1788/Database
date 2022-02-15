/**
 * 자동차 클래스
 * @author smart04
 *
 */
public class Car {
	
	String modelName;
	int speed;

	
	//get는 값을 가져오는 것
	//set는 값을 설정하는 것
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
/**
 * 함수설명 : 현재속도를 출력한다.
 * @return 현재속도km/h
 */
	public int getSpeed() {
		return speed;
	}
/**
 * 함수설명 : 속도를 설정한다.
 * 0이하는 0을 나타내고, 최고속도는 240이다.
 * @param speed
 * 
 */
	public void setSpeed(int speed) {
		if(speed <= 0) {
			this.speed = 0;
		}else if(speed >240) {
			this.speed = 240;
		}else {
			this.speed = speed;
		}
	}
	
	
	
}
