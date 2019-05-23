package java20190417;

import java.util.Random;

public class Java20190417_5 {
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		lotto[0] = (int)(Math.random() * 45) + 1;
		for(int i = 1; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	} 
}
