package _02_StringMethod;

// contains(String) : 문자열이 포함되어 있는데 boolean으로 반환
public class T03_contains {

	public static void main(String[] args) {
		String str = "JAVA PROGRAMING";
		boolean flag = str.contains("PRO");
		
		if(flag) {
			System.out.println("프로입니다");
		}else {
			System.out.println("아마추어입니다");
		}
	}

}
