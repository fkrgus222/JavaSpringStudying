package List�迭��Ŭ�����鿹��;

import java.util.List;
import java.util.ArrayList;

public class ArrayListClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		//��ü �߰�
		list.add(new Integer(90));  // ���� 90�� ��üȭ ��Ŵ! list.add(90) �̰͵���. --> �ڵ� �Ľ� ( �ڵ����� ��üȭ)
		list.add(new Integer(85));
		list.add(new Integer(100));
		list.add(new Integer(70));
		list.add(new Integer(75));
		
		System.out.println(list);
		//[90,85,100,70,75]
		
		list.add(2,60);
		System.out.println(list);
		//[90,85,60,100,70,75]
		
		
		
		
	}

}
