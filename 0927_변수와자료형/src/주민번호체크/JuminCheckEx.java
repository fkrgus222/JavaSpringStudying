package 주민번호체크;

import java.time.LocalDate;
import java.util.Scanner;

public class JuminCheckEx {
	
	public static void main(String[] args) {
		//준비 단계 : 필요 변수, 배열의 초기화
		String juminNum;
		int sum = 0;
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int temp, result;
		
		//입력단계
		System.out.println("주민번호 입력 >>>  ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
		/*
		 * 입력받느 주민번호를 유효성 검사 => 정규 표현식(regex) 패턴 적용
		 */
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		
		//[첫번째 방법]
//		boolean check = Pattern.matches(regex,juminNum);
		
		//[두번째 방법]
		boolean check = juminNum.matches(regex);
		
		if (check == false) {
			System.out.println("입력한 주민번호는 정규 표현식 형식에 맞지 않음!");
		}
		else {
			System.out.println("입력된 주민번호는 정규 표현식에 형식에 적합함!");
		}
		
		
		//1단계 적용 => sum 구하기 
		System.out.println("=====1=====");
		for (int i = 0 ; i < juminNum.length()-1; i ++){
			if (juminNum.charAt(i) == '-') continue;
			sum += (juminNum.charAt(i)-48) * weight[i];
		}
		
		System.out.println("sum : " + sum);
		
		
		//2단계 적용.
		System.out.println("=====2=====");
		temp = 11 - sum%11;
		System.out.println("temp : " + temp);
		
		
		//3단계
		System.out.println("=====3=====");
		result = temp%10;
		int lastDigit = juminNum.charAt(juminNum.length()-1)-48;
		
		if (lastDigit == result) System.out.println("Your JuminNumber is Correct!!");
		else {
			System.out.println("Your JuminNumber is Not Correct!!");
			return;
		}
		// ---------------검증 완료
		
		
		//나이 구하기 
		System.out.println("=====나이구하기=====");
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		
		int myBirthYear = Integer.parseInt((juminNum.substring(0,2)));
		if (juminNum.charAt(7) - 48 < 3) {   
			myBirthYear += 1900;
		}
		else myBirthYear += 2000;
		System.out.println(year -myBirthYear + 1);
		
		
		//성별 구하기
		System.out.println("=====성별 구하기=====");
		if ( (juminNum.charAt(7) - 48) % 2 == 0) {
			System.out.println("성별 : 여자");
		}
		else System.out.println("성별 : 남자");
		
		
		//"출신 지역" 구하기 
		//주민번호 뒤자리중 2~3번째 자리.
		
		
		
		//생년월일 구하기 
		System.out.println("=====생년월일 구하기=====");
		int myYear = myBirthYear;
		int myMonth = Integer.parseInt(juminNum.substring(2,4));
		int myDay = Integer.parseInt(juminNum.substring(4,6));
		System.out.println(myBirthYear + "년 " + myMonth + "월 "+myDay +"일 입니다.");
		
		
		//"띠" 추출
		System.out.println("=====생년월일 구하기=====");
		String ddi = null;
		String[] gangi = {"원숭이", "닭", "개", "돼지", "쥐","소","범","토끼","용","뱀","말","양"};
		ddi = gangi[myYear%12];
		System.out.println(ddi + "띠 입니다.");
		
		
		
		
		
		
		
	} //main end here

}   //class end here
