package java20190403;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ΰ��� �Է��Ͻÿ�.");
		double height = sc.nextDouble();
		System.out.println("���ΰ��� �Է��Ͻÿ�.");
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
		System.out.println("�Է��� ���� �簢���� ���̴� " + setArea);
	}	
}
