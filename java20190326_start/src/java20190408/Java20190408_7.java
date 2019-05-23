package java20190408;

public class Java20190408_7 {

	public static void main(String[] args) {
		BusCar c = new BusCar("현대버스", "빨간색", 40);
		c.printInfo();
	}
}

 class Car {
	 
	 String name;
	 String color;
	 
	 public Car(String name, String color) {
		 this.name = name;
		 this.color = color;
	 }
 }
  class BusCar extends Car {
	 int number;
	
	 public BusCar(String name, String color, int number) {
		 super(name, color);
		 this.number = number;
	 }
	 public void printInfo() {
		 System.out.println(number + "명을 태울 수 있는 " +color + " " + name +  "입니다.");
 	 }
 }
	 
 