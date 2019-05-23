package java20190417;

public class Java20190417_2 {

	public static void main(String[] args) {
	      Integer iObj = 10;     // 오토 박싱 진행
	      Double dObj = 3.14;     // 오토 박싱 진행
				      
	      int num1 = iObj;     // 오토 언박싱 진행
	      double num2 = dObj;     // 오토 언박싱 진행
	 
	      System.out.println(num1);
	      System.out.println(num2);
	      
	      Integer num = 10;
	      num++;     // new Integer(num.intValue() + 1);

	      num += 3;     // new Integer(num.intValue() + 3);
	      
	      int r = num + 5;   // 오토 언박싱 진행
	      Integer rObj = num - 5;   // 오토 언박싱 진행
	      
	      System.out.println(num);
	      System.out.println(rObj);
	
	   }

	}


