package java20190408;

import java.util.Scanner;

public class Java20190408_0 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Person[] arrPerson = new Person[3];
			
		for( int i = 0; i < arrPerson.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.next();
			System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
			String number = sc.next();
			
			arrPerson[i] = new Person();
			arrPerson[i].setName(name);
			arrPerson[i].setNumber(number);
			
		}
		

		for(int i=0; i < arrPerson.length; i++) {
			arrPerson[i].getPersonInfo();
			
			
		}
	}
	

}

	class Person {
		String name;
		String number;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public void getPersonInfo() {
			System.out.println("�̸���" + name + "�ֹι�ȣ�� " + number);
		}
	}
	
	
