package java20190410;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		int[] tm = new int[10];								 //ȭ�� ���� �ż�
		int[] pm = new int[10]; 								// ���κ� �ż�
		
		Scanner sc = new Scanner(System.in);
		
		for(int k =0; k <3; k++) {             				// 3�� �ݺ�
			System.out.println("Money"); 					//Money ���
			int ym = sc.nextInt(); 								// �Է¹��� ���� ym�� ����
			int m = 50000; 										// ȭ�� �ֻ����� 5������ 
			int sw = 1; 											// ������ 5�� 2�� ���� 
			
																		// ���κ��ż�(pm)�� ���ϴ� for��
			for(int i = 0; i<10; i++) {
				pm[i]=ym/m; 										// �Է� ���� ���� 50000������ ���� �� ����
				ym = ym-(pm[i]*m); 							// ���� �ż� ����
				if(sw==1) { 										// sw�� 1�̸� ������ 5 
					m=m/5;
					sw = 0; 											// 0���� ��ȯ
				} else {											 // 0�� �� ������ 2
					m=m/2;
					sw = 1;											 // 1�� ��ȯ �ݺ�!! 
				}
			}
																		// ȭ�� ������ ���� �ż�(tm) ���ϴ� for��
			for(int i =0; i <10; i++) {
				tm[i]+=pm[i];
			}
																		//���κ� ȭ��ż� ���
			for(int i = 0; i <10; i++) {
				System.out.print(pm[i]+" ");
			}
			System.out.println();
		}
																		//������ �����ż���� 
		for(int i = 0; i<10;i++) {
			System.out.print(tm[i]+"");
		}
	}	 
	

}
