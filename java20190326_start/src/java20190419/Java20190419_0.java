package java20190419;

public class Java20190419_0 {

	public static void main(String[] args) {
			Box<Integer> iBox = new Box();    // ���� ����
			iBox.set(24);
			Box<Double> dBox = new Box();    // ���� ����
			dBox.set(0.5);
			
/*
		   aBox.set(new Apple());    // ���ڿ� ����� ��´�.
		   oBox.set(new Orange());   // ���ڿ� �������� ��´�.
		   
		   Apple ap = (Apple)aBox.get();    // ���ڿ��� ����� ������.
		   Orange og = (Orange)oBox.get();   // ���ڿ��� �������� ������.
*/
		   System.out.println(iBox.get());
		   System.out.println(dBox.get());
		   
		   
		}
}
class Apple {
   public String toString() { return "I am an apple."; }
}

class Orange {
   public String toString() { return "I am an orange."; }
}

class Box<T> {  
   private T ob;
   
   public void set(T o) {
	   ob = o; 
   }
   public T get() {
	   return ob; 
   }
}


