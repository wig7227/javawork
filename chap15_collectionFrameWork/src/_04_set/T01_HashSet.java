package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T01_HashSet {

	public static void main(String[] args) {
		// HashSet<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		
		System.out.println("set의 size : " + set2.size());
		System.out.println("----------------------------");
		// set의 객체 얻어오기.
		// 순서가 없기 때문에 get(index)로 가져올 수 없다
		// Iterator 사용
		Iterator<String> iterator = set2.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
		}
		System.out.println("----------------------------");
		
		iterator = set2.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();	
			if(str.equals("b"))				//b를 가져오시오
				iterator.remove();
		}
		
		
		iterator = set2.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
		System.out.println(str);
		}
		System.out.println("---------------------------");
		
		set2.remove("c");
		iterator = set2.iterator();
		
		// String에서 사용 가능
		while(iterator.hasNext()) {
			String str = iterator.next();
		System.out.println(str);
		}
	}

}
