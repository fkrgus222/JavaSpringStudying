package ���빮��_�ζ�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TeacherMakeLotto {
/*
 * TreeSet�� ������ �� �̹� �����ϱ� ������ �о�� �� ���� ������ �ʿ䰡 ����.
 * TreeSet�� Binary Search Tree�� ���·� �����͸� �����ϴ� �÷����̴�.
 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set set = new HashSet();   HashSet�� ���(���� ����Ʈ�� ��ȯ�� ��������)
		Set set = new TreeSet();   //TreeSet�� ���, �����ϸ� �������� ����
		
		for (int i = 0 ; set.size() < 6 ; i ++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45) + 1;   //1 ~ 45���� ���� �߻�
			set.add(new Integer(number));
		}
		
		System.out.println("<< �ζǹ�ȣ �����ֱ� >>");
//		List list = new ArrayList(set);
//		Collections.sort(list);
//		System.out.println(list);  //list�� �ٲ۵� ��������
		System.out.println(set);
		
		
	}
}
