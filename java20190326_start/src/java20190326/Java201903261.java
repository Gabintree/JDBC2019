package java20190326;

public class Java201903261 {

	public static void main(String[] args) {
		int kor = 100;
		int eng = 40;
		int math = 100;
		
		double avg = (kor + eng + math) / 3;
				
		if((avg >= 90) && (avg <= 100)) {
			System.out.println("�� �Դϴ�.");
		}else if(avg >= 80) {
			System.out.println("�� �Դϴ�.");
		}else if(avg >= 70) {
			System.out.println("�� �Դϴ�.");
		}else if(avg >= 60) {
			System.out.println("�� �Դϴ�.");
		}else 
			System.out.println("�� �Դϴ�.");
	}
}
