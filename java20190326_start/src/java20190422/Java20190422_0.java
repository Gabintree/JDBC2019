package java20190422;

import java.util.LinkedList;
import java.util.List;

public class Java20190422_0 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String s : list)
			System.out.print(s + '\t');
	}
}

