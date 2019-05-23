package java20190405;

public class Java20190405_0 {

	public static void main(String[] args) {
	
		Box[] ar = new Box[3];
		
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Thid");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}

class Box {
	private String conts;
	
	Box(String cont) { 
		this.conts = cont; 
	}
	public String toString() {
		return conts;
	}
 	
}


