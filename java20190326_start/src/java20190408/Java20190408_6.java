package java20190408;

public class Java20190408_6 {

	public static void main(String[] args) {
		Point3D xyz = new Point3D(12,3,4);
		xyz.print3D();
		
		Point2D qwe = new Point2D();
		qwe.setX(30);
		qwe.setY(40);
		qwe.print2D();
	}
}

class Point2D {
	int x;
	int y;
	
	public Point2D() {
		
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print2D() {
		System.out.println(x +" "+y);
	}
}
class Point3D extends Point2D {
	int z;
	
	public Point3D(int x, int y, int z) {

		this.x = x;
		this.y = y;
		this.z = z;
		
	}
			
	public void print3D() {
		System.out.println(x +" "+ y + " " + z);
	}
}