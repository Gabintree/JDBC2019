package java20190419;

public class java20190419_2 {

	public static void main(String[] args) {
	
		Box3<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box3<Double> dBox = BoxFactory.<Double>makeBox(7.59);   // 7.59�� ���� ���� �ڽ� �����
	}

}

class BoxFactory {
	   public static <T> Box3<T> makeBox(T o) {
	      Box3<T> box = new Box3<T>();   // ���ڸ� �����ϰ�,
	      box.set(o);   // ���޵� �ν��Ͻ��� ���ڿ� ��Ƽ�,
	      return box;   // ���ڸ� ��ȯ�Ѵ�.
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