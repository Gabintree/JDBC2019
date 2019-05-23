package java20190404;

import java.util.Scanner;

public class Java20190404_0 {

	public static void main(String[] args) {
		String st1 = "b";
		String st2 = "a";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
	
		
		String str = "abcdefg";
		String a = str.substring(2);
		System.out.println(a);
		String b = str.substring(3,4);
		System.out.println(b);
		
		int cmp = st1.compareTo(st2);
		if(cmp == 0)
				System.out.println("두 문자열은 일치합니다");
		else if(cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st2);
		
		double e = 2.718281;
		String se = String.valueOf(e);
		
		String source = " 1 3 5 ";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d + = %d  \n", num1, num2, num3, sum);
		
		}
}


