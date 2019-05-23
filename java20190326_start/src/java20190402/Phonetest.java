package java20190402;

import java.util.Scanner;

public class Phonetest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
						
		System.out.println("이름을 입력하시오");
		String name = scanner.nextLine();		
		System.out.println("연락처를 입력하시오");
		String pnum = scanner.next();
		
		Phone a = new Phone(name, pnum);
		scanner.close();
	}
}

class Phone {
	
	String name;
	String  pnum;
	
	public Phone(String name, String pnum) {
		this.name = name;
		this.pnum = pnum;
		
		System.out.println(name + pnum);
	}

}

