package java20190416;


class Parent{
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("부모 드로우");
	}	
}

class Child extends Parent {
	
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.print("자식 드로우");
	}	
}
class IOExceptionCase3 { 
	
    public static void main(String[] args) throws Exception  {
    	
    	Parent child = new Child();
    	child.paint();
    }
}

