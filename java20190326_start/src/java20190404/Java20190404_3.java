package java20190404;

import java.util.Scanner;

public class Java20190404_3 {

	public static void main(String[] args) {
		int[] a = new int[10];
		//int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		Scanner sc = new Scanner(System.in);
		
		
		  for(int i = 0; i <a.length; i++) {
		  System.out.print(i+1 + "번째 숫자 : ");
		  a[i]=sc.nextInt();
		  }
		  for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				continue;
		  }else if (a[i] % 3 == 0) {
				System.out.println(a[i]);
		   }
		}
		
	}

}




/*
 * do { if(arr[i]<0) sysout"0보다 작은 수. 다시 입력" arr[i] = scanner.nextInt(); }while(
 * arr[i]< 0); }
 */