package �����Ƿκ������̰���;

class RobotRace extends Thread{
	
	public RobotRace(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		//���� �κ� 100m ������ => 10m�� ����.
		for (int i = 0 ; i <= 10 ; i ++) {
			System.out.println(getName() + "�� " + i*10 + "m����");
			try {
				sleep(1000);  //1�� �Ͻ� ����
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		
	}
	
}


public class RobotRaceStart extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotRace robotA = new RobotRace("�κ�-A");
		RobotRace robotB = new RobotRace("�κ�-B");
		RobotRace robotC = new RobotRace("�κ�-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
		
	}

}
