package java20190417;

public class Cartest {

	public static void main(String[] args) {

		Car lambo = new Car();
		lambo.setCar("black", 4000, "����",  "��ȣŸ�̾�");
		lambo.carInfo();
		
		Car rarri = new Car();
		rarri.setCar("red", 3500, "��Ʋ��", "�ؼ�");
		rarri.carInfo();
	
		Car range = new Car("gray",  3000, "����" , " ��ȣŸ�̾�");
		range.carInfo();
		
	}
}

class Car {
	
	String color;
	int cc;
	String navi;
	String wheel;
	public Car() {
	}
	public Car(String color, int cc, String navi, String wheel) {
		this.color = color;
		this.cc = cc;
		this.navi = navi;
		this.wheel = wheel;
	}
	
	public void setCar(String color, int cc, String navi, String wheel) {
		this.color = color;
		this.cc = cc;
		this.navi = navi;
		this.wheel = wheel;
		
	}
	
	public void carInfo() {
		System.out.println(color + ", " + cc + ", " + navi + ", " + wheel);
	}
}
