package this�ǽ�;

class Person{
	//�������
	private int juminNum;    //�ֹι�ȣ
	private long millitaryNum;	//����
	private int birthYear;	//����⵵
	private int birthMonth;	//�����
	private int birthDay;	//�����

	public Person(int juminNum,long millitaryNum, int bYear, int bMonth, int bDay) {
		this.juminNum = juminNum;
		this.millitaryNum = millitaryNum;
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	
	public Person(int juminNum, int bYear, int bMonth, int bDay) {
		this(juminNum, 0, bYear, bMonth, bDay);
	}
	
	public void showInfo() {
		System.out.println("�ֹι�ȣ : " +juminNum);
		System.out.println("������� : " + birthYear + "/" + birthMonth + "/" + birthDay);
		
		if (millitaryNum != 0) {
			System.out.println("����: " + millitaryNum + '\n');
		}
		else {
			System.out.println("���� ���� ����\n");
		}
	}
	
}// class Person


public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person man = new Person(961214,880102,1996,12,14);
		Person wman = new Person(961214,1990,11,16);
		
		man.showInfo();
		wman.showInfo();
	}

}
