package java20190408;

public class SuperSubCon {

	public static void main(String[] args) {
		new SubCLS();		
	}
}
class SuperCLS { 
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}
class SubCLS extends SuperCLS {
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

