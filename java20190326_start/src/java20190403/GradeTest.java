package java20190403;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("�̸��� �Է��Ͻÿ�.");
			String name = scanner.next();
			System.out.println("�й��� �Է��Ͻÿ�.");
			String snum = scanner.next();
			System.out.println("���������� �Է��Ͻÿ�.");
			int kor = scanner.nextInt();
			System.out.println("���������� �Է��Ͻÿ�.");
			int eng = scanner.nextInt();
			System.out.println("���������� �Է��Ͻÿ�.");
			int math = scanner.nextInt();
			System.out.println("��ǻ�������� �Է��Ͻÿ�.");
			int com = scanner.nextInt();
			Grade gabin = new Grade(name, snum, kor, eng, math, com);
			System.out.println(gabin.avg());
			
			System.out.println("�����Ͻðھ��? �� : 1, �ƴϿ� : 2");
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
				return "����� " + avg + "������ " + "A";
			}else if(avg >= 80) {
				return "����� " + avg + "������ " + "B";
			}else if(avg >= 70) {
				return "����� " + avg + "������ " + "C";	
			}else if(avg >= 60) {
				return "����� " + avg + "������ " + "D";	
			}
			return "����� " + avg + " ������ " + "F";
		}
}
	


