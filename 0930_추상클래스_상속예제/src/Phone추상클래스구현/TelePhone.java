package Phone�߻�Ŭ��������;

public class TelePhone extends Phone{

	@Override
	public void canDo() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ� ������ �Ѵ�.");
	}
	
	TelePhone(String userName, String phoneNumber){
		super(userName, phoneNumber);
	}
	
}
