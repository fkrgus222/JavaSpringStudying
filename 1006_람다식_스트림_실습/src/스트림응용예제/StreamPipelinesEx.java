package ��Ʈ�����뿹��;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * ȸ��(Member) ��ü���� '����' ȸ���� ��� ���̸����ٽİ� ��Ʈ���� 
 * �����Ͽ� ���α׷� �ۼ�
 */
public class StreamPipelinesEx {

	public static void main(String[] args) {
		
		List<Member> list = (List)Arrays.asList(new Member("����ȣ",Member.MALE,  30), 
												new Member("�迬��",Member.FEMALE,29),
												new Member("������",Member.MALE,  32),
												new Member("����ȫ",Member.MALE,  27));
		
		double sum = 0;
		int count = 0;
		//[1���] �ܺ� �ݺ��ڸ� �����Ͽ� �ذ�.����ȸ���� ��ճ��� ���ϱ� 
		//use Iterator Ȥ�� for 
		
		//use Iterator
		Iterator<Member> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Member target = iterator.next();
			if( target.getGender() == Member.MALE) {
				sum += (double)target.getAge();
				count += 1;
			}
		}
		
		System.out.println("������ ��� ���̴� : " + sum/count);
		
		//use for
		for(int i = 0 ; i < list.size(); i ++) {
			if(list.get(i).getGender() == Member.MALE) {
				sum += list.get(i).getAge();
				count++;
			}
		}
		
		

		//[2���] ���� �ݺ��ڸ� �����Ͽ� �ذ�.
		//use Stream

		
		//���� Ǭ�� 
//		int sum2 = 0;
//		int count2 = 0;
//		Stream<Member> stream = list.stream();
//		stream.forEach(target2 ->{
//			if(target2.getGender() == Member.MALE) {
//				sum2 += target2.getAge();
//				count2 += 1;
//			}
//		});
		
		//���
		double ageAvg = list.stream()       //�������� ��Ʈ��
							.filter(m -> m.getGender() == Member.MALE)  //�߰� ó�� ��Ʈ��
							.mapToInt(Member::getAge)					//�߰� ó�� ��Ʈ��
							.average()									//���� ó�� ��Ʈ��
							.getAsDouble();								//

		System.out.println("������ ��� ���̴� : " + ageAvg);
	
	
	}
}
