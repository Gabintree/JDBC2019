package java20190328;

public class Java20190328_5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		hello('콩');
		System.out.println("프로그램 끝.");
	}
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
	}
	public static void hello(char A) {
		System.out.println("점심시간이에요.");
		System.out.println("오늘 점심은" + A + "입니다.");
	}
}

