package Map�迭��Ŭ�����鿹��;

import java.util.Enumeration;
import java.util.Properties;

/*
 * Properties Ŭ������ �ַ� ������ MVC ����� �Խ��� ���� �� ���
 * ������ ȯ�� ���� ���� (applicationContext.xml) ������ �� �ַ� ��� 
 */

public class PropertiesClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü ����
		Properties prop = new Properties();
		
		//��ü�� key �� value ����
		prop.setProperty("name", "����ȣ");
		prop.setProperty("email", "parkk345@naver.com");
		prop.setProperty("HP", "010-2315-1234");
		
		//��ü ��������
		Enumeration enu = prop.propertyNames();
			//propertyNames = Returns an enumeration of all the keys in this property list, 
			//including distinct keys in the default property list if a key of the same name 
			//has not already been found from the main properties list.
		
		
		while(enu.hasMoreElements()) {
			String ele = (String) enu.nextElement();
			System.out.println(ele + " : " + prop.getProperty(ele));
		}
		
		
	}
}
