package java20190411;



public class Java20190411_0 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
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
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}
}
	class UnivFriend extends Friend {     // 대학 동창

		   private String major;    // 전공
	
		   public UnivFriend(String na, String ma, String ph) {
			   super(na,ph);		
			   major=ma;
		   }
		   public void showInfo() {
		      System.out.println("이름: " + name);
		      System.out.println("전공: " + major);
		      System.out.println("전화: " + phone);
		   }
		}

		class CompFriend extends Friend {     // 직장 동료

		   private String department;     // 부서

		   public CompFriend(String na, String de, String ph) {
			   super(na,ph);
			   department = de;
		   }
		   public void showInfo() {
		      System.out.println("이름: " + name);
		      System.out.println("부서: " + department);
		      System.out.println("전화: " + phone);
		   }
		}

