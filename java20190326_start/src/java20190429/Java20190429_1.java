package java20190429;

import java.util.Scanner;

interface IScan {
	boolean trueFalse(int num);
}
public class Java20190429_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 정수를 입력하세영");
		int num = sc.nextInt();
		
		Number n = new Number(num);
		if (n.trueFalse(num)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
class Number implements IScan {
	
	int num;
	
	public Number(int num) {
		this.num = num;
	}
	
	@Override 
	public boolean trueFalse(int num) {
		
		int m = 0;
		int n = 0;
		
		m = num / 10 ;
		n = num -(m*10);
		
		if(m == n) {
			return true;
		}else {return false;}
	}
}

/*
1. Scanner  클래스를 이용하여 
2자리의 정수(10~99사이)를 입력받고, 
십의자리와 1의자리가 같은 지 판별하여 
출력하는 프로그램을 작성하라.

interface IScan {
boolean trueFalse(int num);
}
*/

