package �ֹι�ȣüũ;



public class Utils {
	
	public static int stepOne(String target) {
		int multiple = 2;
		int sum = 0;
		for (int i = 0 ; i < target.length() ; i++) {
			int tmp = (int)(target.charAt(i));
			
			if (tmp >= 0 && tmp <= 9) {
				if (multiple == 10) {
					multiple = 2;
				}
				sum = sum + multiple*tmp;
				multiple += 1;
			}
			
			
		}
		return sum;
	}

}
