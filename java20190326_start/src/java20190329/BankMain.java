package java20190329;

public class BankMain {

	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		check(park);
		Calculator cal = new Calculator();
		cal.sub(10,7);
		CircleArea circle = new CircleArea();
		circle.setRadius(30);
		circle.getArea();
		//결과값이 314가 나오도록 하시오...ㅠㅠ엉어유ㅠ 
		CircleArea sam = new CircleArea();
		System.out.println(sam.samArea(4,4));
		//결과값이 8이 나오도록 하시오  ㅜㅜㅜ 
		
		yoon.deposit(5000);
		park.deposit(3000);
			
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		Triangle tri = new Triangle();
	tri.setheight(10);
	tri.setwidth(10);		
	System.out.println(tri.getArea());}
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
		}
}

 class Triangle {
	int height;  
	int width;
	
	public void setheight(int a ) {
		 height = a;
			}
	public void setwidth(int b) {
		 width = b;
	}
	public int getArea() {
		return (height * width) / 2;
	}

	
	//출력이 50이 되도록 하세용....
	
	

}