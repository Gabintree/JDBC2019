package java20190429;

import java.util.Scanner;

interface IScan {
	boolean trueFalse(int num);
}
public class Java20190429_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ڸ� ������ �Է��ϼ���");
		int num = sc.nextInt();
		
		Number n = new Number(num);
		if (n.trueFalse(num)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
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
1. Scanner  Ŭ������ �̿��Ͽ� 
2�ڸ��� ����(10~99����)�� �Է¹ް�, 
�����ڸ��� 1���ڸ��� ���� �� �Ǻ��Ͽ� 
����ϴ� ���α׷��� �ۼ��϶�.

interface IScan {
boolean trueFalse(int num);
}
*/

