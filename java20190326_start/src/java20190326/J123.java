package java20190326;

public class J123 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int big = ( num1 > num2 ) ? num1 : num2;
		
		System.out.println(big);
		
		int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		
		System.out.println(diff);
		
		if (num1 > num2) 
		{
          System.out.println(num1);
        } else {
          System.out.println(num2);	
        }
			
		
}
	
}