package ��;

public class VIPCustomer extends Customer{
	
	protected int discountRate;
	protected int agentID; // ��� ���� ID	
	
	VIPCustomer(int userID, String userName, int agentID){
		super(userID, userName, 5,"VIP");
		this.discountRate = 10;
		this.agentID = agentID;
	}
	
	public void pay(int price) {
		String target = Utils.toNumberFormat( (int)(price/100*(100-discountRate)) );
		System.out.println(userName + "���� ������ "+price + "�� ������ : " + target + " �Դϴ�.");
		bonusPoint +=  (int)(price/100*(100-discountRate))/100*bonusRate;
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
