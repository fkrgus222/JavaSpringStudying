package Phone�߻�Ŭ��������;

public class SmartPhone extends Phone{

	@Override
	public void canDo() {
		// TODO Auto-generated method stub
		System.out.println("���ͳ� �˻��� �Ѵ�.");
	}
	
	SmartPhone(String userName, String phoneNumber){
		super(userName, phoneNumber);
	}
	
}
