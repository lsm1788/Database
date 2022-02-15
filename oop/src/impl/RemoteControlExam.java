package impl;

public class RemoteControlExam {

	public static void main(String[] args) {
		Remotecontrol rc = new Television();
		rc.turnOn();
		rc.setVolume(16);
		rc.turnOff();
	}

}
