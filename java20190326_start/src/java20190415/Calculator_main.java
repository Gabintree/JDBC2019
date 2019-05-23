package java20190415;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator op = new Calculator(a,b);
		
		while(true) {
		
			String c = sc.next();
			
			try {
				if(c.equals("+")) {
					op.add();
				}else if(c.equals("-")) {
					op.sub();
				}else if(c.equals("*")) {
					op.mul();
				}else if(c.equals("/")) {
					op.div();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Calculator {
	
	int a;
	int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void add () {
		System.out.println(a + b);
	}
	public void sub() {
		System.out.println(a - b);
	}
	public void mul() {
		System.out.println(a * b);
	}
	public void div() {
		System.out.println(a / b);
	}
	
	
	
}
 
