package java20190404;

class Box {

	private String conts;
	
	Box(String cont) { 
		this.conts =cont; 
	}
	public String toString() {
		return conts;
	}
}

public class ArrayIsInstance2 {
	public static void main(String[] args) {
		Box[] ar = new Box[5];
		System.out.println("length : " + ar.length);
	}
}
