package java20190416;

import java.util.Scanner;

public class Java20190416_2 {
	   public static void main(String[] args) {
		      System.out.print("나이 입력: ");
		   
		       try {
		          int age = readAge();
		          System.out.printf("입력된 나이: %d \n", age);
		       }
		       catch(ReadAgeException e) {
		          System.out.println(e.getMessage());
		       }
		   }
		   public static int readAge() throws ReadAgeException {
		      Scanner kb = new Scanner(System.in);
		      int age = kb.nextInt();
		      
		      if(age < 0)
		         throw new ReadAgeException(); // 예외의 발생
		      
		      return age;
		   }
		}

class ReadAgeException extends Exception {    // Exception을 상속하는 것이 핵심
	   public ReadAgeException() {
	      super("유효하지 않은 나이가 입력되었습니다.");
	   }
	}

