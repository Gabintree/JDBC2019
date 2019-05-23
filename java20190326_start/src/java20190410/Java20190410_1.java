package java20190410;

public class Java20190410_1 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE","Computer","010-333-555");
		frns[cnt++] = new UnivFriend("SEO","Electronics","010-222-444");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}
	}

}

class Friend {
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}
class comFriend extends Friend {
	private String department;
	
	public comFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
public void showInfo() {
	super.showInfo();
	System.out.println("부서 : " + department);
	}
}
class UnivFriend extends Friend {
	private String major;
	
	public UnivFriend(String na, String ma, String ph) {
		super(na,ph);
		major =ma;
	}
	public void showInfo() {
	super.showInfo();
	System.out.println("전공: " + major);
	}
}
