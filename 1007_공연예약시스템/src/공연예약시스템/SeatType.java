package ��������ý���;

import java.util.Scanner;

public class SeatType {
	private char type;
	private Seat[] aSeat; //�������� =>��������� �����ϰڴ�.
	
	//������
	public SeatType(char type, int num) {//�¼��� ����, �¼���ȣ
		this.type = type;
		aSeat = new Seat[num]; //�迭 ��ü ����
		
		for(int i = 0; i < aSeat.length; i++) {
			aSeat[i] = new Seat();
		}
		
	}
	//����� ���� �޼ҵ� ����
	public boolean seatReserve() {
		Scanner in = new Scanner(System.in);
		int seatNum;
		String name;
		show();
		System.out.print("�̸� : ");
		name = in.next();
		
		System.out.println("�¼���ȣ : ");
		seatNum =in.nextInt();
		
		if(seatNum < 1 || seatNum > aSeat.length) {//�����¼����� ��� ���� 
			System.out.println("�߸��� �ڼ���ȣ �Դϴ�.");
			return false;
		}
		if(aSeat[seatNum-1].isOccupied()) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return false;
		}
		aSeat[seatNum-1].reserveName(name);
		return true;
		
	}
	public boolean cancel() {
		Scanner in = new Scanner(System.in);
		show();
		System.out.println("�̸� : ");
		String name = in.next();
		
		if(name != null) {
			for(int i = 0; i<aSeat.length;i++) {
				if(aSeat[i].match(name)) {
					aSeat[i].cancel();
					return true;
				}
			}
			System.out.println("����� ������ �̸��� ã�� �� ����.");
		}
		return false;
	}
	
	
	public void show() {
		System.out.print(type + "�� ����: ");
		
		for(int i=0;i<aSeat.length;i++) {
			if (aSeat[i].isOccupied())
					System.out.print(aSeat[i].getName());
			else
				System.out.print("---");
			System.out.print(" ");
		}
		System.out.println();
	}
}
