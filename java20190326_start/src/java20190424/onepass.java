package java20190424;

public class onepass {

	public static void main(String[] args) {
		
	int sum1 = 0;
	int sum2 = 0;
						
			for(int i = 0; i <= 100; i++) {
					if(i % 2 == 0) {
					sum1 = sum1 + i;
			}else {sum2 = sum2 + i;}
			}
		System.out.println("1부터 100까지의 정수 중");
		System.out.println("짝수들의 합은 " + sum1 + "입니다.");
		System.out.println("홀수들의 합은 " + sum2 + "입니다.");
	}
}
