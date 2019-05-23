package java20190423;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java20190423_3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
		for(Integer n : ks)
			System.out.println(map.get(n).toString() + '\t');
		System.out.println();
		
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
		      System.out.print(map.get(itr.next()) + '\t');
		   System.out.println();
	}

}
