package java20190327;

public class java20190327_0 {
	public static void main(String[] args) {
		int kor = 100;
		int eng = 70;
		int math = 60;
		
		double avg = (kor + eng + math) / 3.0; 
				
		if(avg >= 90) {
			System.out.println("수");
		}else if(avg >= 80) {
			System.out.println("우");
		}else if(avg >= 70) {
		    System.out.println("미");
		}else if(avg >= 60) {
			System.out.println("양");
		}else
			System.out.println("가");				
		}
	}
