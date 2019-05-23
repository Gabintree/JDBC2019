package java20190328;

import java.util.Scanner;

public class Java20190328_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long input = sc.nextLong();
		long sum = 0;
		
		for(int i = 0; i <= input; i++) {
			if (i % 2 != 0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);

	}

}

