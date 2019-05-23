package java20190328;

public class Java20190328_1 {

	public static void main(String[] args) {
			
		for(int a = 2; a < 10; a++) {
				if(a % 2 == 0 )
			for(int b = 1; b<10; b++) {
				 int c = a*b;
				 if(c % 2 == 0 ) {
					System.out.println(a + " x " + b + " = " + a*b);	
		        }
		   }
		}
   } 
}
