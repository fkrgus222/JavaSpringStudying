package Phone�߻�Ŭ��������;

public abstract class Phone {

	protected String userName;
	protected String phoneNumber;
	
	public abstract void canDo();
	
	public void turnOn() {
		System.out.println("���� �Ҵ�.");
	}
	public void turnOff() {
		System.out.println("���� �Ҵ�.");
	}
//	public void show() {
//		System.out.println("����� �̸��� : " + userName + "�ڵ��� ��ȣ�� : " + phoneNumber);
//	}
	
	
	final public void run() {
//		show();
		turnOn();
		canDo();
		turnOff();
		System.out.println("=================");
	}
	
	public Phone() {}
	public Phone(String userName, String PhoneNumber) {
		this.userName = userName;
		this.phoneNumber = PhoneNumber;
	}
	
	
	
}
