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
		System.out.print("���ϴ� ������� ������ ���ʷ� �Է����ּ���.(�������� ����)");
	
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
		System.out.println("�� �̸��� : " + name + " ������ : " + color + "�Դϴ�.");
	}
		
}
	
	

