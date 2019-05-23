package java20190329;

public class CircleArea {
	/*
	double b = (3.14);
	public double getArea(int a) {
		return (a*a*b);
	
	}
	 */
	
	final double PI =3.14;
	double radius;
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public void getArea() {
		System.out.println(radius * radius * PI);
	}
	
	public int samArea(int a, int b) {
	final int C = 2;
	return (a*b/C);
		
	}
	
	public static void main(String[] args) {
		CircleArea circle = new CircleArea();
		
		circle.setRadius(5);
		circle.getArea();
	}
	
}
	

