package java20190410;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		int[] tm = new int[10];								 //화폐 누적 매수
		int[] pm = new int[10]; 								// 개인별 매수
		
		Scanner sc = new Scanner(System.in);
		
		for(int k =0; k <3; k++) {             				// 3번 반복
			System.out.println("Money"); 					//Money 출력
			int ym = sc.nextInt(); 								// 입력받은 값을 ym에 대입
			int m = 50000; 										// 화폐 최상위값 5만원권 
			int sw = 1; 											// 나누기 5랑 2의 구분 
			
																		// 개인별매수(pm)을 구하는 for문
			for(int i = 0; i<10; i++) {
				pm[i]=ym/m; 										// 입력 받은 값을 50000원으로 나눈 몫 대입
				ym = ym-(pm[i]*m); 							// 구한 매수 차감
				if(sw==1) { 										// sw가 1이면 나누기 5 
					m=m/5;
					sw = 0; 											// 0으로 변환
				} else {											 // 0일 때 나누기 2
					m=m/2;
					sw = 1;											 // 1로 변환 반복!! 
				}
			}
																		// 화폐 단위별 누적 매수(tm) 구하는 for문
			for(int i =0; i <10; i++) {
				tm[i]+=pm[i];
			}
																		//개인별 화폐매수 출력
			for(int i = 0; i <10; i++) {
				System.out.print(pm[i]+" ");
			}
			System.out.println();
		}
																		//단위별 누적매수출력 
		for(int i = 0; i<10;i++) {
			System.out.print(tm[i]+"");
		}
	}	 
	

}
