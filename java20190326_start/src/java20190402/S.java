package java20190402;

 public class S{
 
	 public static void main(String[] args) {  
		 Salary abcd = new Salary("�߾���", 30000000); 
		 abcd.getInformation1();
	 }
 }
  class Salary {
	  String name;
	  int salary; 
	 	
	  public Salary(String a, int b) {
			name = a;
			salary = b;
	 }
	  public void getInformation1() {
		  System.out.println(name + "�� ������ " + String.format("%,d", salary)+ "�� �ϱ��?");
		 
	  }
 }
 
 
