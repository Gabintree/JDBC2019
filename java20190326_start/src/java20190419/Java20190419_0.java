package java20190419;

public class Java20190419_0 {

	public static void main(String[] args) {
			Box<Integer> iBox = new Box();    // 상자 생성
			iBox.set(24);
			Box<Double> dBox = new Box();    // 상자 생성
			dBox.set(0.5);
			
/*
		   aBox.set(new Apple());    // 상자에 사과를 담는다.
		   oBox.set(new Orange());   // 상자에 오렌지를 담는다.
		   
		   Apple ap = (Apple)aBox.get();    // 상자에서 사과를 꺼낸다.
		   Orange og = (Orange)oBox.get();   // 상자에서 오렌지를 꺼낸다.
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


