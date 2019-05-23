package java20190416;

import java.util.Scanner;

public class Java20190416_2 {
	   public static void main(String[] args) {
		      System.out.print("���� �Է�: ");
		   
		       try {
		          int age = readAge();
		          System.out.printf("�Էµ� ����: %d \n", age);
		       }
		       catch(ReadAgeException e) {
		          System.out.println(e.getMessage());
		       }
		   }
		   public static int readAge() throws ReadAgeException {
		      Scanner kb = new Scanner(System.in);
		      int age = kb.nextInt();
		      
		      if(age < 0)
		         throw new ReadAgeException(); // ������ �߻�
		      
		      return age;
		   }
		}

class ReadAgeException extends Exception {    // Exception�� ����ϴ� ���� �ٽ�
	   public ReadAgeException() {
	      super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	   }
	}

