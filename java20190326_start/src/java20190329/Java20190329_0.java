package java20190329;

public class Java20190329_0 {

	public static void main(String[] args) {
		
		star(30);
		
			}
	public static void star(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
