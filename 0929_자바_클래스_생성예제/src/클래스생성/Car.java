package Ŭ��������;

public class Car {
	private int speed; 		   //����ӵ�
	private String wheelNum;   // ������ ����
	private String carName;	   //�絿�� �̸� 
	
	//������
	public Car() {
		speed = 10;
		wheelNum = "4";
		carName = "avante";
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car("���׽ý�");
		myCar.show();
		
		
	}

}
