package java20190327;

public class Java20190327_11 {

	public static void main(String[] args) 
	{
		
		int sum = 0;
			
		for(int a=1; a <= 10; a++) 
		{
			  if(a % 2 == 0) 
			  {
				  sum += a;
			  }
		}
		System.out.println(sum);
	}
}