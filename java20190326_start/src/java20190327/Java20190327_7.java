package java20190327;

public class Java20190327_7 {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0 ))
			continue;
			
			count++;
			System.out.println(num);
			
		}
		System.out.println("count : " +count);
	}

}
