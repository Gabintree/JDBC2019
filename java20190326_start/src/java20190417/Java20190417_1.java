package java20190417;

public class Java20190417_1 {

	public static void main(String[] args) {
		Integer iObj = new Integer(10);    // �ڽ�
		   Double dObj = new Double(3.14);    // �ڽ�
		   
		   
		   int num1 = iObj.intValue();           // ��ڽ�
		   double num2 = dObj.doubleValue();     // ��ڽ�  
		  

		   // ���� �ν��Ͻ� ���� ���� ���
		   iObj = new Integer(iObj.intValue() + 10);
		   dObj = new Double(dObj.doubleValue() + 1.2);
		
		   System.out.println(iObj);
		   
		  System.out.println(dObj);
		}

}

	
