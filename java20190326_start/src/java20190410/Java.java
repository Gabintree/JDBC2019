package java20190410;

public class Java {

	public static void main(String[] args) {
	
		Test result = new Test(85,70,100);
		result.avg();
	}
}

class Test {
	
	int kor;
	int eng;
	int math;
	
	public Test(int kor, int eng, int math) {
		
		this.kor= kor;
		this.eng=eng;
		this.math=math;
	}
	
	public void avg() {
		int avg = (kor + eng + math) / 3;
		
		if(avg >= 90) {
			System.out.println("수");
		}else if(avg >= 80) {
			System.out.println("우");
		}else if(avg >= 70) {
			System.out.println("미");
		}else if(avg >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
	}
}
