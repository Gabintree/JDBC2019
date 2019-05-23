package java20190409;

public class Java20190409_04 {

	public static void main(String[] args) {
			NamedCircle result = new NamedCircle(5, "Waffle");	
			result.result();
	}
}
class Circle {
	private int radius;

	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return radius;}
}
class NamedCircle extends Circle {
	String waffle;
	public NamedCircle(int a, String b) {
		super(a);
		waffle = b;
	}
	public void result () {
		System.out.println(waffle + ", ¹ÝÁö¸§ = " + getRadius());
	}
}