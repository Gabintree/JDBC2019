package java20190415;

interface ICal {
	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
}

class Cal implements ICal{
	
	public Cal() {
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	
}

public class Java20190415_interface {

	public static void main(String[] args) {
		Cal op = new Cal();
		System.out.println(op.add(3, 4));

	}

}
