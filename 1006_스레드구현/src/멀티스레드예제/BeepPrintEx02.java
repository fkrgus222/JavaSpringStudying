package ��Ƽ�����忹��;

public class BeepPrintEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();    //�� �������� �۾� ������� ���� �����尡 ���ÿ� ���� 
		//Ex01���� �ٸ��� Beep���� Console���� ���� --> ��Ƽ������
		
		
		for (int i = 0 ; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);   //1�ʰ� �Ͻ� ����
			}catch(Exception e) {}
		}

		
	}
}
