package java20190401;

public class CircleTest {

	public static void main(String[] args) {

		Circle circle = new Circle(39.4);
		System.out.println("¿øÀÇ ³ÐÀÌ: " + circle.getArea());

		circle.setRad(5.0);
		System.out.println("¿øÀÇ ³ÐÀÌ: " + circle.getArea());
	}
	
	}

class Circle {
	final double PI = 3.14;
	double r ;
	
	public Circle (double a) {
		r = a;
	}
	public double getArea() {
		return r * r * PI;
	}
	public void setRad(double b) {
		r = b; 
	}
	
}

