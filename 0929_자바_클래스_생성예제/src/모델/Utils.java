package ��;

import java.text.DecimalFormat;

public class Utils {
	/*
	 * �Է� ���� �ݾ��� õ ���� ���� �ĸ� �ֱ� �Լ� ���� 
	*/
	public static String toNumberFormat(int totalAmount) {
		
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
		
	}
	
	
}
