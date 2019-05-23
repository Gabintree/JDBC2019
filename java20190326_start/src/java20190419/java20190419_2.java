package java20190419;

public class java20190419_2 {

	public static void main(String[] args) {
	
		Box3<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box3<Double> dBox = BoxFactory.<Double>makeBox(7.59);   // 7.59에 대해 오토 박싱 진행됨
	}

}

class BoxFactory {
	   public static <T> Box3<T> makeBox(T o) {
	      Box3<T> box = new Box3<T>();   // 상자를 생성하고,
	      box.set(o);   // 전달된 인스턴스를 상자에 담아서,
	      return box;   // 상자를 반환한다.
	   }

}

class Box3<T> {  
	   private T ob;
	   
	   public void set(T o) {
		   ob = o; 
	   }
	   public T get() {
		   return ob; 
	   }
	}