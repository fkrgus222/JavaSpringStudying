package Car�߻�Ŭ��������;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<<�������� �ڵ��� �׽�Ʈ>>>");
		Car myCar = new AICar();
		myCar.run();
		System.out.println();
		
		System.out.println("<<<����� �����ϴ� �ڵ���>>>");
		Car hisCar = new ManualCar();
		hisCar.run();
		
	}

}
