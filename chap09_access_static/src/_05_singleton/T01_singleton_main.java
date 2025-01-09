package _05_singleton;

public class T01_singleton_main {

	public static void main(String[] args) {
		// 개게를 만들지 못함. 생성자가 private 이라서
		//T01_singleton s1 = new T01_singleton();
		
		T01_singleton s1 = T01_singleton.getsingleton();
		T01_singleton s2 = T01_singleton.getsingleton();
		T01_singleton s3 = T01_singleton.getsingleton();
		
		if(s1 == s2)
			System.out.println("같은 객체를 가리킴");
		else
			System.out.println("다른 객체");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
