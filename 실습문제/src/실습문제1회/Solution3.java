package �ǽ�����1ȸ;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");
		int year = in.nextInt();
		String answer = "";
		
//		if (year%4 == 0) {
//			answer = "����";
//			if (year%100 == 0 && year%400 != 0) answer = "���";
//		}
//		else answer = "���";
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			answer = "����";
		}
		else answer = "���";
		
		
		
		
		System.out.println(answer + "�Դϴ�.");
	}

}
