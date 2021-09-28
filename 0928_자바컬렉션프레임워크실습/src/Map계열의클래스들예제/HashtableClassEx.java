package Map계열의클래스들예제;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userID = {"Lee","Kim","Jang","Wang","Ha"};
		String[] password = {"L123","K456","J234","W896","H567"};
		
		//Hashtable 객체 생성
		Hashtable<String, String> ht = new Hashtable<String, String>(userID.length);
		
		//객체 저장
		for (int i = 0 ; i < userID.length ; i++) {
			ht.put(userID[i], password[i]);
		}
		
		System.out.println(ht);
		//{Jang=J234, Ha=H567, Lee=L123, Wang=W896, Kim=K456} 배열은[]인것과 달리 {}로저장, 
		//순서가 중요하지 않다. Key를 통해서 찾으니까. 
		
		boolean FLAG = true;
		//대부분의 변수를 소문자로 저장했지만, 이건 대문자로 저장함.
		//(스위치 변수) 껐다, 켰다
		
		Scanner in = new Scanner(System.in);
		
		while(FLAG) {  //무한 루프 
			System.out.print("유저 ID는 >>> ");
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			
			if (pw_value != null) { // 입력한 ID가 존재.
				System.out.println("유저 PASSWORD는 >>> ");
				String passwordInputValue = in.nextLine();
				
				if(pw_value.equals(passwordInputValue)) {
					System.out.println("인증 성공!!");
				}
				else {
					System.out.println("인증 실패!!");
				}
			} //If pw_value != null
			else { //입력한 ID가 존재하지 않는다.
				System.out.println("입력한 유저 ID는 등록되지 않았습니다.");
			} //else
		}//while(FLAG)
		
		
		
		
	}//end of main
}//end of class
