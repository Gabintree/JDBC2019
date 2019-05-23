package java20190401;

public class Grade_1 {
	public static void main(String[] args ) {
		
	Grade kwank = new Grade("곽윤기", 90, 100, 70);
	System.out.println(kwank.getName() + "의 " +
	"성적은 " + kwank.getGrade() + "입니다.");
	
	kwank.setMath(10);
	
	System.out.println(kwank.getName() + "의 " + "성적은 " + kwank.getGrade()
	+ "입니다.");
	}
}

class Grade{
	String name;
	int kor;
	int eng;
	int math;
	
	public Grade(String a, int b, int c, int d) {
		name = a;
		kor = b;
		eng = c;
		math = d;
	}
	public String getName() { 
		return name;
	}
	public String getGrade() {
		int avg = (int)(kor+eng+math)/3;
		
		if (avg >= 90) {
			return "수, " + "평균은 " + avg;
		}else if(avg >=80) {
			return "우, " + "평균은 " + avg;
		}else if(avg >= 70) {
			return "미, " + "평균은 "  + avg;
		}else if(avg >= 60) {
			return "양, " + "평균은 "  + avg;
		} 
		return "가, " + "평균은 "  + avg;
	}
	public void setMath(int e) {
		math = e;
	}
}
