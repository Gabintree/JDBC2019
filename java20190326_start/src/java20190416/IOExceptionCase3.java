package java20190416;


class Parent{
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("�θ� ��ο�");
	}	
}

class Child extends Parent {
	
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.print("�ڽ� ��ο�");
	}	
}
class IOExceptionCase3 { 
	
    public static void main(String[] args) throws Exception  {
    	
    	Parent child = new Child();
    	child.paint();
    }
}

