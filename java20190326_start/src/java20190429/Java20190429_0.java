package java20190429;
import java.util.Scanner;
interface ICar{
	String getColor();
	String getName();
	void showCar();
}
public class Java20190429_0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 차량명과 색상을 차례로 입력해주세요.(공백으로 구분)");
	
		String color = sc.next();
		String name = sc.next(); 
		
		Car c = new Car(color, name);
		c.showCar();
	}
}
class Car implements ICar {
	
	String color, name;
	
	public Car(String color, String name) {
		this.color = color;
		this.name = name;
	}
	@Override
	public String getColor() {
		return color;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void showCar() {
		System.out.println("차 이름은 : " + name + " 색상은 : " + color + "입니다.");
	}
		
}
	
	

