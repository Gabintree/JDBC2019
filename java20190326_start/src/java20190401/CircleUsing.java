package java20190401;

public class CircleUsing {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());
		
		Triangle tr2 = new Triangle();
		tr2.setBottom(7.5);
		tr2.setHeight(9.2);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr2.getArea());
	}
	
}

class Triangle {
	double setBottom ;
	double setHeight;
	
	public Triangle() {}
	
	public Triangle(double bo, double he ) {
		setBottom = bo;
		setHeight = he;
	}
	
	public void setBottom(double a) {
		setBottom = a;
	}
	public void setHeight(double b) {
		setHeight = b;
	}
	
	public double getArea() {
		return setBottom * setHeight / 2;
		
	}
}