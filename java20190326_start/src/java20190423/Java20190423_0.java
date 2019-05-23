package java20190423;

import java.util.Scanner;

public class Java20190423_0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		System.out.println("1~3  중에 숫자 하나를 입력하세용");
		a = sc.nextInt();
		
		switch (a)
		{
		case 1 :
			System.out.println("*");
		case 2 : 
			System.out.println("**");
		case 3 : 
			System.out.println("***");
		
		}
	}
}
