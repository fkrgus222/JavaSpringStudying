package �ǽ�����1ȸ;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {rdm
		
		int[] arr = {0,0,0,0,0,0,0,0};       //�� ���� ������ ��� �ʿ������� ������ �迭
		int[] arr2 = {50000,10000,5000,1000,500,100,50,10};  //�� ���� ������ Int����
		String[] arr3 = {"��������","������","��õ����","õ����","�����","���","���ʿ�","�ʿ�"};  //����� ���� �� ���� ������ ���ڿ� ���� �迭 
		
		System.out.println("�ݾ��� �Է��� �ּ��� : ");
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();   //�Է¹޴� �ݾ�
		
		System.out.println(); //����
		for ( int i = 0 ; i < arr.length ; i ++) {
			arr[i] = money/arr2[i];			//���� ������ ������ ���Ѵ�.
			money = money%arr2[i]; 			//���� ������ŭ ������ ���� ������
			
			if (arr[i] == 0)continue;	//0�� Ȥ�� 0���� ��� ������� �ʴ´�.
			
			if (arr2[i] <= 500)		System.out.println(arr3[i] + " " + arr[i] + "��"); //������ '��'�� ���
			else					System.out.println(arr3[i] + " " + arr[i] + "��"); //������ '��'�� ���
		}
		
		
		
		
		
	}
}
