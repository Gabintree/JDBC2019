package java20190408;

public class Java20190408_3 {

	public static void main(String[] args) {
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		for(Box e : ar) {
			if(e.getBoxNum() == 505)
				System.out.println(e.name);
		}
	}
}
class Box {
		
	int num;
	String name;
	
	public Box(int num, String name) {
		this.num = num;
		this.name= name;
	}
	public int getBoxNum() {
		return num;
	}
	
}