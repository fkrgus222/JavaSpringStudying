package Ŭ��������;
/*
 * Taxi Ŭ���� => �ڽ�(����) Ŭ����
 */

public class Taxi extends Car{

	
	//�޼ҵ� ���� ( �������̵� )
	public void speedUp(int velocity) {
		speed = speed + velocity;
		
		if (speed > 100) {
			speed = 100;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi myTaxi = new Taxi();
		myTaxi.speedUp(150);
		myTaxi.show();
		
	}

}
