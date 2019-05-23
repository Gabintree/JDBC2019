package java20190405;

public class Java20190405_2 {

	public static void main(String[] args) {

	//	Java20190405_02 a = new Java20190405_02();
		//int sum = a.sumOfAry(ar);
		
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int sum = sumOfAry(ar);
		
		System.out.println(sum);
	}
	
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
			sum += ar[i];
		
		return sum;
	}

		static int[] makeNewIntAry(int len) {
			int[] ar = new int[len];
			return ar;
		}
}
