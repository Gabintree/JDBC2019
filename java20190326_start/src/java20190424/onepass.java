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
		System.out.println("1���� 100������ ���� ��");
		System.out.println("¦������ ���� " + sum1 + "�Դϴ�.");
		System.out.println("Ȧ������ ���� " + sum2 + "�Դϴ�.");
	}
}
