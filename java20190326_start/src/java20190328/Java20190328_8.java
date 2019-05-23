package java20190328;

public class Java20190328_8 {

	public static void main(String[] args) {
		System.out.println(sub(10,9));
		System.out.println(mul(12,2));
		System.out.println(div(54,5));
		System.out.println(max(54,5));
		abs(-7);
		System.out.println(abs2(-5));
		
		
	}
			public static int sub(int num1, int num2) { 
			int subresult = num1- num2;
			return subresult;
			}
			public static int mul(int a, int b) {
				int mulresult = a * b;
				return mulresult;
			}
			public static double div(double a, double b) {
							return a / b;
			}
			
			public static int max(int a, int b) {
				if(a>b) {
					return a;
				}else { return b;
				}
			}
			public static void abs(int a) {
				System.out.println(Math.abs(a));
			}
			public static int abs2(int a) {
				if(a>=0) {
					return a;
				}else {
					return a*-1;
				}
			}
				
			}




