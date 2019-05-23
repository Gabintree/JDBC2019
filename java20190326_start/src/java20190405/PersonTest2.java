package java20190405;

import java.util.Scanner;

class Student{
	int kor;
	int eng;
	int math;
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}

public class PersonTest2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		for(int i = 0; i < arr.length; i++) {
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			arr[i] = new Student(kor, eng, math);
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getKor();
		}
		System.out.println(sum);
		

	}

}
