package java20190402;

public class Java20190402_0 {

	public static void main(String[] args) {
		 Grade kwank = new Grade("������", 90 ,100, 70);
		 
		 System.out.println(kwank.getName());
		 
		 System.out.println(kwank.getName() + "��" + "������" + kwank.getGrade() + "�Դϴ�");
		 
		 kwank.setMath(10);
		 
		 System.out.println(kwank.getName() + "��" + "������" + kwank.getGrade() + "�Դϴ�"); 
	}

}

class Grade {
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
	public int getGrade() {
		int avg = (kor + eng + math) / 3;
		return avg;
	}
	public void setMath(int e) {
		math = e;
	}
}
