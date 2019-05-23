package java20190425;
import java.util.Scanner;
interface IArea{
	double GetArea();
}
public class Java20190425_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[1. �ﰢ�� 2. �簢�� 3. ��] ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("���ο� ���θ� �Է��ϼ���");
			int w = sc.nextInt();
			int h = sc.nextInt();
			Triangle ta = new Triangle(w, h); 
			System.out.println(ta.GetArea());
		}else if (num == 2) {
			System.out.println("���ο� ���θ� �Է��ϼ���");
			int w = sc.nextInt();
			int h = sc.nextInt();
			Square sa = new Square(w, h);
			System.out.println(sa.GetArea());
		}else if(num == 3) {
			System.out.println("�������� �Է��ϼ���");
			int r = sc.nextInt();
			Circle c = new Circle(r);
			System.out.println(c.GetArea());
		}
	}
}
class Triangle implements IArea {
	int w, h;
		public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public double GetArea() {
		return w * h / 2;
	}
}
class Square implements IArea{
	int w, h;
		public Square(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public double GetArea() {
		return w * h;
	}
}
class Circle implements IArea {
	int r;
		public Circle(int r) {
		this.r = r;
	}
	@Override
	public double GetArea() {
		return r * r * Math.PI;
	}
}