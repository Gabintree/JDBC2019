package java20190328;

public class Java20190328_3 {

	public static void main(String[] args) {
	 char c = '¡Ú';
	 char f = '¡Ù';
		
			 for(int a = 0; a<5; a++) {
				 for(int k = 0; k<4-a; k++) {
					 System.out.print(f);
				 }
				 int d = a*2+1;
				 for(int b = 0; b<d; b++) {
					
					 System.out.print(c);
				 }
				 for(int k = 0; k<4-a; k++) {
					 System.out.print(f);
				 }
				 System.out.print("\n");
			 }
	}

	
}



