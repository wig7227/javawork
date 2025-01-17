package _05_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		HashMap<String, Snack> map = new HashMap<>();
		
		map.put("새우깡", new Snack("새우맛", 500));
		map.put("포카칩", new Snack("감자맛", 700));
		map.put("홈런볼", new Snack("초코맛", 800));
		map.put("고래밥", new Snack("고래맛", 300));
		System.out.println(map);
		
		Snack snack = map.get("새우깡");
		System.out.println(snack);
		
		map.put("고래밥", new Snack("고래맛",400));
		System.out.println(map);
		
		// replace(key, value) map.put과 동일
		map.replace("포카칩", new Snack("감칠맛", 400));
		System.out.println(map);
		System.out.println("--------------------------------------");
		
		// 객체를 하나씩 출력
		// entrySet()
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		Iterator<Entry<String, Snack>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Snack> entry = iter.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + " - " + value);
		}
		/*Set entry = map.entrySet();
		System.out.println(entry);*/
	}

}
