package �������̽��ǽ�;

/**
 * RemoteControl �������̽��� Television Ŭ������ Audio Ŭ������
 * ������ �ִ� ��ɵ��� '�߻� �޼ҵ�'�� �����صδ� �������̽��̴�.
 */

public interface RemoteControl {
	//'��������' �������
	 int MAX_VOLUME = 10; //�ִ� ���� //public static final ���� ����!
	public static final int MIN_VOLUME = 0; //�ּ� ����
	
	//'�߻� �޼ҵ�' ����
	public abstract void turnOn(); //public abstract ���� �����ϴ� 
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	/*
	 * �ڹ� 8�������ʹ� '����Ʈ' �޼ҵ�� '����' �޼ҵ带 ���� ����� ���� ����!
	 * �ڹ� ������ ���忡�� �������� �ο�!
	 */
	
	//'����Ʈ'�޼ҵ� ���� => ����� ����? >> ���� interface�� Ȯ�忡�� ���ο� ����� �߰��Ѵ�
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//'����'�޼ҵ� ����=>����� ���� >> ����Ʈ�޼ҵ�ʹ� �޸� ��ü�� ��� �������̽������� ȣ���� ������!
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
