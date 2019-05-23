package java20190410;

public class fill {

	public static void main(String[] args) {
	
		
		int[][] abc = new int[5][5];

		int k = 1; 											// 1~25까지 더해질 숫자
		int sw = 1; 										// 1은 오른쪽  0은 왼쪽 방향 전환
		
		for(int i = 0; i <=4; i++) {
			if(sw == 1) {
				for(int j = 0; j <=4; j ++ ) { 			// j는 오른쪽으로
					abc[i][j] = k;
					k++;
				}
			}else {
				for(int j = 4; j >= 0; j--) { 			// j는 왼쪽으로
					abc[i][j] = k;
					k++;
				}
			}
			sw = sw*-1;
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(abc[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
