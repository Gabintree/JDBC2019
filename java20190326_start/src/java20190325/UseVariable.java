package java20190325;

public class UseVariable {

	public static void main(String[] args) {
		int kor = 70;
		int eng = 90;
		int math = 100;
		
		int total = kor + eng + math;
		double avg = total / 3;
					
		System.out.println("���� = " + total);
		System.out.println("��� = " + avg);
		
		
		int circle = 6;
		final double PI = 3.14;
	    double area = circle * circle * PI;
	    	    
	    System.out.println("���� ���� = " + area);
	    
	    double base = 3.14;
	    double height = 3.14;
	    double tirangleArea = (base * height) / 2;
	  
	    System.out.println("�ﰢ���� ���� = " +tirangleArea);
	    
	    char ch1 = '��';
	    char ch2 = 'Ȯ';
	    char ch3 = 54736;
	    char ch4 = 54869;
	    char ch5 = 0xd5d0;
	    char ch6 = 0xd655;
	    System.out.println(ch1 + " " + ch2);
	    System.out.println(ch3 + " " + ch4);
	    System.out.println(ch5 + " " + ch6);
	    
	    final int MAX_SIZE = 100;
	    final char CONST_CHAR = '��';
	    final int CONST_ASSIGNED ;
	    
	    CONST_ASSIGNED = 12;
	    System.out.println("���1 : " + MAX_SIZE);
	    System.out.println("���2 : " + CONST_CHAR);
	    System.out.println("���3 : " + CONST_ASSIGNED);
	       	   	    		
	    
	}

}
