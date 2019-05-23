package java20190408;

public class Java20190408_4 {

	public static void main(String[] args) {
		int[][] arr = new int [9][9];
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = (i+1)*(j+1);
				
				
			}
		}

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j< 9; j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}

	}
}