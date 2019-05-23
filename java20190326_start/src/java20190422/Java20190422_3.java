package java20190422;

import java.util.HashSet;
import java.util.Set;

public class Java20190422_3 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		for(int i = 0; set.size() < 6; i++) {
			int lotto = (int)(Math.random() * 45) + 1;
			set.add(lotto);
		}
		
		System.out.print(set);
	}
}
