package java20190419;

interface Eatable { public String eat(); }

class Apple2 implements Eatable {
   public String eat() {
      return "It tastes so good!";
   }  
}
class Box2<T extends Eatable> {
   T ob;
   public void set(T o) { ob = o; }
   public T get() {
      System.out.println(ob.eat());    // Eatable로 제한하였기에 eat 호출 가능
      return ob;
   }
}
public class java20190419_1 {
	public static void main(String[] args) {
		Box2<Eatable> mandu = new Box2<>();
		mandu.set(new Apple2());
		mandu.get();
	}
}


