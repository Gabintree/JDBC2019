package java20190403;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세로값을 입력하시오.");
		double height = sc.nextDouble();
		System.out.println("가로값을 입력하시오.");
		double width = sc.nextDouble();
		
		Square_1 square = new Square_1();
		square.area(height, width);
		square.getArea();
	}
}

class Square_1{
	double height;
	double width;
	
	public void area(double height, double width) {
		if(height < 0) {
			height = 0;
		}else if(width < 0) {
			width = 0;
		}
		this.height = height;
		this.width = width;
	}
	public void getArea() {
		double setArea = height * width;
		System.out.println("입력한 값의 사각형의 넓이는 " + setArea);
	}	
}
