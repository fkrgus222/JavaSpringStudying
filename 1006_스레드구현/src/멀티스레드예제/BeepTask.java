package ��Ƽ�����忹��;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for ( int i = 0 ; i < 5 ; i ++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);   //1�ʰ� �Ͻ� ����
			}catch(Exception e) {}
		}
	}

}
