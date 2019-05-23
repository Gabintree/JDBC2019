package java20190409;

public class Java20190409_01 {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		((SmartPhone)ph2).playApp();

	}
}

class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("HI~form " + number);
	}
}
class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
