package ��;

public class GOLDCustomer extends Customer{
	
	protected int discountRate;
	
	GOLDCustomer(int userID, String userName){
		super(userID, userName,2);
		this.discountRate = 10;
	}
	
	public void pay(int price) {
		System.out.println(price + "�� ������ : " + (int)(price*0.9) + " �Դϴ�.");
		bonusPoint += price/100*bonusRate;
	}

	public void show() {
		super.show();
		System.out.println("������� ��������  : " + discountRate);
	}
	
}
