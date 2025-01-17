package _06_tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Ex {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet();
		tree.add("dd");
		
		Map<String,String> map = new HashMap();
		
		map.put("dd", "ddd");
		
		System.out.println(map.containsValue("ddd"));
		
		int num [] = new int[5];
		int num2 []= {1,2,3,4,5};
		for(int d : num2) {
			System.out.println(d);
		}
		

	}

}
