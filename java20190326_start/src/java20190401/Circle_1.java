package java20190401;

public class Circle_1 {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle_1(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r < 0 ) { 
			rad = 0;
			return;
	   }
	rad = r;
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
	
	public static void main(String args[]) {
		Circle_1 c = new Circle_1(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		c.rad = 4.5;
		System.out.println(c.getArea());

		Circle_1 circle = new Circle_1(39.4);
		System.out.println("¿øÀÇ ³ÐÀÌ: " + circle.getArea());

		circle.setRad(5.0);
		System.out.println("¿øÀÇ ³ÐÀÌ: " + circle.getArea());
	}
		
			}


