package java20190405;

import java.util.Scanner;

class Person  {
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
		System.out.println("이름은 " + name + "주민번호는 " + number);
	}	

}
 
 public class PersonTest {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Person[] arrPerson = new Person[3];
		 
		 for(int i=0; i < arrPerson.length; i++) {
			 String name = sc.next();
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
 
 
