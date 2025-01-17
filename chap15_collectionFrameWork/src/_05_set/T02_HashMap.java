package _05_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		// 키=id, 값=pw (3개)
		
		// 사용자로부터 ip 와 pw를 받아서
		// id가 map에 있나 확인, 없으면 '존재하지 않는 id 입니다'
		// id가 있으면 pw를 보고
		// pw가 일치하면 '로그인 되었습니다'
		// pw가 일치하지 않으면 '비밀번호가 일치하지 않습니다'
		
		Map<String,String> map = new HashMap<>();
		
		map.put("wig7227", "1234");
		map.put("hello", "qwe123");
		map.put("goodbye", "qwe123");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		while(true) {
			System.out.println("id 입력 : ");
			String id = sc.next();
	
			if(map.containsKey(id)) {
				while(true) {
					System.out.println("pw 입력");
					String pw = sc.next();
					
				  /*String mapPw = map.get(id);
				    if(pw.equals(mapPw)) {*/
					
					if(map.containsValue(pw)) {
						System.out.println("로그인 되었습니다");
						flag = true;
						break;
					} else {
						System.out.println("비밀번호가 일치하지 않습니다");
					}
				}
				if(flag)
					break;
			} else {
				System.out.println("존재하지 않는 id 입니다");
				continue;
			}	
		}
	}
}
