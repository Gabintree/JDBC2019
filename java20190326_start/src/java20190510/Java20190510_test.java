package java20190510;
import java.util.Scanner;

public class Java20190510_test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int sw = 0;
		
		while (true) {
			double output;
			
			if(sw == 0) {
				System.out.println("��ȣ�� �Է��ϼ���.1) inchi ->cm  2) cm->inchi  3) �������� -> ��  4) kg -> pound ");
				num = sc.nextInt();
				if(num == 1 || num == 2 || num == 3 || num == 4 ) {
					sw=1;
				}else { 
					sw=0;
					continue;
				}
			}
	
			System.out.println("��ȯ�� ������ �Է��ϼ���. Q �Ǵ� 0 �Է½� �ʱ�ȭ������ �̵�");
			String input = sc.next();
			
			if(input.equals("Q")||input.equals("0")) {
				sw = 0;
				continue;
			}
			
			switch (num) {
			
			case 1 : 
				output = Integer.parseInt(input) * 2.54;
				System.out.println(output);
				break;
				
			case 2 : 
				output = Integer.parseInt(input) / 2.54;
				System.out.println(output);
				break;
				
			case 3 : 
				output = Integer.parseInt(input) * 0.3025;
				System.out.println(output);
				break;
				
			case 4 : 
				output = Integer.parseInt(input) * 2.204623;
				System.out.println(output);
				break;

			}
		}
	}
}