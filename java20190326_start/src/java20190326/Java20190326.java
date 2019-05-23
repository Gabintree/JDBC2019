package java20190326;

public class Java20190326 {

	public static void main(String[] args) {
		int kor = 50;
		int eng = 40;
		int math = 30;
		
		double avg = (kor + eng + math) / 3;
				
		if(avg >= 90) {
			System.out.println("수 입니다.");
		}
		else if(avg >= 80) {
			System.out.println("우 입니다.");
		}
		else if(avg >= 70) {
			System.out.println("미 입니다.");
		}
		else 
			System.out.println("양 입니다.");
		
	}
}

