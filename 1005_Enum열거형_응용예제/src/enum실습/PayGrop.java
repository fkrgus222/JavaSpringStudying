package enum�ǽ�;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Arrays Ŭ������ �ֿ� �޼ҵ�
 *  => static <T> List<T> asList(T...a)
 *   =>��� : ���޹��� �迭�� ���� ũ����  List�� ��ȯ�Ͽ� ��ȯ���ִ� �޼ҵ�
 * 
 */

public enum PayGrop {
	CASH("����",Arrays.asList("������ü","�������Ա�","�������","�佺")),
	CARD("ī��",Arrays.asList("������","īī������","�ſ�ī��","�������")),
	ETC("��Ÿ",Arrays.asList("����Ʈ", "����")),
	EMPTY("������������",Collections.EMPTY_LIST);
	
	private String title;
	private List<String> payList;
	

	//������
	PayGrop(String title, List<String> payList){
		this.title = title;
		this.payList = payList;
	}
	
	public static PayGrop findByPayCode(String code) {
		
		//�ڹ� ��Ʈ���� ���������� ����
		return Arrays.stream(PayGrop.values())
				     .filter(payGroup -> payGroup.hasPayCode(code))
				     .findAny()
				     .orElse(EMPTY);
	}
	
	//����� ���� �޼ҵ�
	public boolean hasPayCode(String code) {
		return payList.stream().anyMatch(pay-> pay.equals(code));
	}
	
	public String getTitle() {
		return title;
	}

	public List<String> getPayList() {
		return payList;
	}

}
