package Ŭ��������;

/*
 * Car Ŭ���� => �θ�(����) Ŭ����  
 * 
 */

public class Car {
	protected int speed; 		   //����ӵ�
	protected String wheelNum;   // ������ ����
	protected String carName;	   //�絿�� �̸� 
	
	//������
	public Car() {
		
	}
	
	public Car(String name) {
		carName = name;
	}
	
	public Car(int velocity) {
		speed = velocity;
	}
	
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
	
	//����� ���� �޼ҵ�
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
	public void speedDown(int velocity) {
		speed = speed - velocity;
		if (speed < 0) {
			speed = 0;
		}
	}
	public void stop() {
		speed = 0;
	}
	public void show() {
		System.out.println("���� �ӷ��� : " + speed + " ���� ���������� : " + wheelNum + " �� �̸��� : " + carName);
	}
	
	

}
