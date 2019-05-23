package java20190411;

public class Java20190111_6 {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello");
	}
}	
	
interface Printable {
		public void print(String doc);
	
}

class Printer implements Printable {
	public void print(String doc) {
		System.out.println(doc);
	}
}


