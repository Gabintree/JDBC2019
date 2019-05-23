package java20190411;

class Person1{
	
	String name;
	int age;
	
	Person1(String name, int age){
		this.age = age;
		this.name = name;
	}	
	
	@Override
	public boolean equals(Object obj) {
		
        if(obj != null || obj instanceof Person1) {
        	return name == ((Person1)obj).name;
        }else {
        	return false;
        }
    } 

	
}


public class Java20190411_4 {
	public static void main(String[] args) {

		Person1 p1 = new Person1("ȫ�浿",24);
		Person1 p2 = new Person1("ȫ�浿",24);
		
		System.out.println(p1.equals(p2));
	
	}
}