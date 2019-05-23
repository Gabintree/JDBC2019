package java20190405;

import java.util.Scanner;

public class Java20190405_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person_1[] a = new Person_1[3];
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("이름을 입력하세요.");
			String name = sc.next();
			
			System.out.println("주민등록번호를 입력하세요.");
			String pnum = sc.next();
			
		
		}
		for(int i = 0; i < 3; i++) {
			a[i].printf();
		}
	}

}

class Person_1 {
	
	String name;
	String pnum;
	
	
	String[] person = new String[2];
	
	public void setPerson (String name, String pnum) {
		person[0] = name;
		person[1] = pnum;
	}
	
	public void printf() {
		System.out.println(person[0]+ "/" + person[1] );
	}
	
	
}	
	
	


