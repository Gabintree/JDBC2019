package java20190417;

public class Java20190417_2 {

	public static void main(String[] args) {
	      Integer iObj = 10;     // ���� �ڽ� ����
	      Double dObj = 3.14;     // ���� �ڽ� ����
				      
	      int num1 = iObj;     // ���� ��ڽ� ����
	      double num2 = dObj;     // ���� ��ڽ� ����
	 
	      System.out.println(num1);
	      System.out.println(num2);
	      
	      Integer num = 10;
	      num++;     // new Integer(num.intValue() + 1);

	      num += 3;     // new Integer(num.intValue() + 3);
	      
	      int r = num + 5;   // ���� ��ڽ� ����
	      Integer rObj = num - 5;   // ���� ��ڽ� ����
	      
	      System.out.println(num);
	      System.out.println(rObj);
	
	   }

	}


