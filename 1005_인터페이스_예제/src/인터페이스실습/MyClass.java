package �������̽��ǽ�;

public class MyClass {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.turnOff();
		System.out.println();   //����
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		System.out.println();
		

	}

}
