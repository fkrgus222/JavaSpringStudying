package ��;

public class GOLDCustomer extends Customer{
	
	protected int discountRate;
	
	GOLDCustomer(int userID, String userName){
		super(userID, userName,2, "GOLD");
		this.discountRate = 10;
	}
	
	public void pay(int price) {
		String target = Utils.toNumberFormat( (int)(price/100*(100-discountRate)) );
		System.out.println(userName + "���� ������ "+price + "�� ������ : " + target + " �Դϴ�.");
		bonusPoint += (int)(price/100*(100-discountRate))/100*bonusRate;
	}

	public void show() {
		super.show();
		System.out.println("������� ��������  : " + discountRate);
	}
	
}
