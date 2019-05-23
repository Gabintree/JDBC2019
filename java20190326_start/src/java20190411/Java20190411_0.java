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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
	}
}
	class UnivFriend extends Friend {     // ���� ��â

		   private String major;    // ����
	
		   public UnivFriend(String na, String ma, String ph) {
			   super(na,ph);		
			   major=ma;
		   }
		   public void showInfo() {
		      System.out.println("�̸�: " + name);
		      System.out.println("����: " + major);
		      System.out.println("��ȭ: " + phone);
		   }
		}

		class CompFriend extends Friend {     // ���� ����

		   private String department;     // �μ�

		   public CompFriend(String na, String de, String ph) {
			   super(na,ph);
			   department = de;
		   }
		   public void showInfo() {
		      System.out.println("�̸�: " + name);
		      System.out.println("�μ�: " + department);
		      System.out.println("��ȭ: " + phone);
		   }
		}

