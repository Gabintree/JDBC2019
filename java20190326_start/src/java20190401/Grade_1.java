package java20190401;

public class Grade_1 {
	public static void main(String[] args ) {
		
	Grade kwank = new Grade("������", 90, 100, 70);
	System.out.println(kwank.getName() + "�� " +
	"������ " + kwank.getGrade() + "�Դϴ�.");
	
	kwank.setMath(10);
	
	System.out.println(kwank.getName() + "�� " + "������ " + kwank.getGrade()
	+ "�Դϴ�.");
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
			return "��, " + "����� " + avg;
		}else if(avg >=80) {
			return "��, " + "����� " + avg;
		}else if(avg >= 70) {
			return "��, " + "����� "  + avg;
		}else if(avg >= 60) {
			return "��, " + "����� "  + avg;
		} 
		return "��, " + "����� "  + avg;
	}
	public void setMath(int e) {
		math = e;
	}
}
