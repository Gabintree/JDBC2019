package java20190404;

import java.util.Scanner;

public class Java20190404_04 {

	public static void main(String[] args) {
	
		int[] a = new int[10];
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i = 0; i<a.length; i++) {
			if(a[i] >= 0) {
				b+=a[i];
			}else {
				c+=a[i];
			}
		}
		System.out.println(b + " " +c);
		
		sc.close();
	}

}