package java20190418;

public class Java20190418_3 {

	public static void main(String[] args) {
		Box2<String> sBox = new Box2<>();
		sBox.set("I am so happy.");
		
		Box2<Box2<String>> wBox = new Box2<>();
		wBox.set(sBox);

		Box2<Box2<Box2<String>>> zBox = new Box2<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}

class Box2<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}


