package ��;

public class Customer {
	
	protected int userID;
	protected String userName;
	protected int bonusPoint;
	protected int bonusRate;
	
	Customer(){ }
	Customer(int userID, String userName){
		this.userID = userID;
		this.userName = userName;
		this.bonusPoint = 0;
		this.bonusRate = 1;
	}
	
	Customer(int userID, String userName, int bonusRate){
		this.userID = userID;
		this.userName = userName;
		this.bonusPoint = 0;
		this.bonusRate = bonusRate;
	}
	
	public void pay(int price){
		System.out.println(price + "�� ������ : " + price + " �Դϴ�.");
		bonusPoint += price/100*bonusRate;
	}
	
	public void show() {
		System.out.println("����� ID�� : " + userID);
		System.out.println("����� �̸��� : " + userName);
		System.out.println("����ڰ� ������ ���ʽ� ����Ʈ�� : " + bonusPoint);
	}
	
	
}
