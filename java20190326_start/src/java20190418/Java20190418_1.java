package java20190418;

public class Java20190418_1 {

	public static void main(String[] args) {
	 
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		Apple app = new Apple();
		
		aBox.set(app);
		System.out.println(app);
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}

class Apple{
	public String toString()
	{return " I am an apple.";
	}
}

class Orange {
	public String toString()
	{return " I am an orange.";
	}
}
/*
class Box {
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
			return ob;
	}
*/		
	
	
class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
	}

	
		
	
