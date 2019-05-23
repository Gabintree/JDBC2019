package java20190405;

import java.util.Scanner;

public class CircleTT {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Circle[] cc = new Circle[n];
		
		for(int i = 0; i < cc.length; i++) {
			cc[i] = new Circle(n);
		}
		for(int i = 0; i<cc.length; i++) {
			System.out.println(cc[i].Area());
		}
		
		
	}
}

class Circle {
	double r ;
	final double PI = 3.14;
	
	public Circle() {
	}
	
	public Circle(double r) {
		this.r = r;
	}
		
	public double Area() {
		double area = (double) r *r* PI;
		return area;
	}

}
