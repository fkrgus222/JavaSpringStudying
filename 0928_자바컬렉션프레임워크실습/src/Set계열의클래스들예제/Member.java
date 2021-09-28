package Set�迭��Ŭ�����鿹��;

public class Member {
	//�ν��Ͻ� ����(��ü ����)����
	private String name;    	//�̸�
	private int age;			//����
	private String juminNum;	//�ֹι�ȣ
	
	//������
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
	}
	
	@Override //������
	public int hashCode() {
		return name.hashCode() + age +juminNum.hashCode();
	}
	
	@Override //������
	public boolean equals(Object obj) {
		//�������� instanceof Ÿ��(Ŭ������)
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age) && member.juminNum.equals(juminNum);
		}
		else return false;

	}
	
	
}
