package java20190415;

public class Java20190415_4 {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		System.out.println("..intermediate location .. ");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1;
	}
}
class Board {
	int a;
}
class PBoard extends Board {}


