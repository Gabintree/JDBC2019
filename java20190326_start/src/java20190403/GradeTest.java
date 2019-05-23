package java20190403;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하시오.");
			String name = scanner.next();
			System.out.println("학번을 입력하시오.");
			String snum = scanner.next();
			System.out.println("국어점수를 입력하시오.");
			int kor = scanner.nextInt();
			System.out.println("영어점수를 입력하시오.");
			int eng = scanner.nextInt();
			System.out.println("수학점수를 입력하시오.");
			int math = scanner.nextInt();
			System.out.println("컴퓨터점수를 입력하시오.");
			int com = scanner.nextInt();
			Grade gabin = new Grade(name, snum, kor, eng, math, com);
			System.out.println(gabin.avg());
			
			System.out.println("수정하시겠어요? 예 : 1, 아니오 : 2");
			int is = scanner.nextInt();
			if(is == 1) {
				continue;
			}else {
				break;
			}
		}
	}
}
	class Grade {
		
		String name;
		String snum;
		int kor;
		int eng;
		int math;
		int com;
		
		public Grade(String name, String snum, int kor, int eng, int math, int com) {
			this.name = name;
			this.snum = snum;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.com = com;
		}
		public String avg() {
			int avg = (kor + eng + math + com) / 4;
		
			if(avg >= 90) {
				return "평균은 " + avg + "학점은 " + "A";
			}else if(avg >= 80) {
				return "평균은 " + avg + "학점은 " + "B";
			}else if(avg >= 70) {
				return "평균은 " + avg + "학점은 " + "C";	
			}else if(avg >= 60) {
				return "평균은 " + avg + "학점은 " + "D";	
			}
			return "평균은 " + avg + " 학점은 " + "F";
		}
}
	


