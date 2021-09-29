package ��;

import java.util.Random;

public class VIPCustomer extends Customer{
	
	protected int discountRate;
	protected int agentID; // ��� ���� ID	
	
	VIPCustomer(int userID, String userName, int agentID){
		super(userID, userName, 5);
		this.discountRate = 10;
		this.agentID = agentID;
	}
	
	public void pay(int price) {
		System.out.println(price + "�� ������ : " + (int)(price*0.9) + " �Դϴ�.");
		bonusPoint += price/100*bonusRate;
	}
	
	public void show() {
		super.show();
		System.out.println("������� ��������  : " + discountRate);
		System.out.println("��������� ID : " + agentID);
	}
	
	public void getAgentId() {
		System.out.println("��������� ID�� : " + agentID);
	}
}
