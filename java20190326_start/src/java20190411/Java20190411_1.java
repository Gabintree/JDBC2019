package java20190411;

public class Java20190411_1 {

	public static void main(String[] args) {
	
		Person p1 = new Person(1234);
		Person p2 = new Person(1234);
		
		System.out.println(p1);
		System.out.println();
	}
	
}

class Person {
	
	long id;
	
	public String toString() {
		return String.valueOf(id);	
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id ==((Person)obj).id;
		}else {
			return false;
		}
	}
	Person(long id) {
		this.id = id;
	}
}



