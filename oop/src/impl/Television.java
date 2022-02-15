package impl;

public class Television implements Remotecontrol {

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("현재 TV볼륨:" + volume);
	}

}
