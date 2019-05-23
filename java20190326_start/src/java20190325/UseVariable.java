package java20190325;

public class UseVariable {

	public static void main(String[] args) {
		int kor = 70;
		int eng = 90;
		int math = 100;
		
		int total = kor + eng + math;
		double avg = total / 3;
					
		System.out.println("ÃÑÁ¡ = " + total);
		System.out.println("Æò±Õ = " + avg);
		
		
		int circle = 6;
		final double PI = 3.14;
	    double area = circle * circle * PI;
	    	    
	    System.out.println("¿øÀÇ ³ÐÀÌ = " + area);
	    
	    double base = 3.14;
	    double height = 3.14;
	    double tirangleArea = (base * height) / 2;
	  
	    System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ = " +tirangleArea);
	    
	    char ch1 = 'Çæ';
	    char ch2 = 'È®';
	    char ch3 = 54736;
	    char ch4 = 54869;
	    char ch5 = 0xd5d0;
	    char ch6 = 0xd655;
	    System.out.println(ch1 + " " + ch2);
	    System.out.println(ch3 + " " + ch4);
	    System.out.println(ch5 + " " + ch6);
	    
	    final int MAX_SIZE = 100;
	    final char CONST_CHAR = '»ó';
	    final int CONST_ASSIGNED ;
	    
	    CONST_ASSIGNED = 12;
	    System.out.println("»ó¼ö1 : " + MAX_SIZE);
	    System.out.println("»ó¼ö2 : " + CONST_CHAR);
	    System.out.println("»ó¼ö3 : " + CONST_ASSIGNED);
	       	   	    		
	    
	}

}
