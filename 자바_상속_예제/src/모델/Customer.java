package ��;

public class Customer {
	
	protected int userID;
	protected String userName;
	protected int bonusPoint;
	protected int bonusRate;
	protected String customerGrade;
	
	Customer(){ }
	Customer(int userID, String userName){
		this.userID = userID;
		this.userName = userName;
		this.bonusPoint = 0;
		this.bonusRate = 1;
		this.customerGrade = "GENERAL";
	}
	
	Customer(int userID, String userName, int bonusRate, String customerGrade){
		this.userID = userID;
		this.userName = userName;
		this.bonusPoint = 0;
		this.bonusRate = bonusRate;
		this.customerGrade = customerGrade;
	}
	
	public void pay(int price){
		System.out.println(userName +"���� ������ " + price + "�� ������ : " + Utils.toNumberFormat(price) + " �Դϴ�.");
		bonusPoint += price/100*bonusRate;
	}
	
	public void show() {
		System.out.println("===========================");
		System.out.println("����� ID�� : " + userID);
		System.out.println("����� �̸��� : " + userName);
		System.out.println("����� �����: " + customerGrade);
		System.out.println("����ڰ� ������ ���ʽ� ����Ʈ�� : " + bonusPoint);
	
	
	
	}
}
