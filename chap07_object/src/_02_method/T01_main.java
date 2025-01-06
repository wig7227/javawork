package _02_method;

public class T01_main {

	public static void main(String[] args) {
		T01_api_method m1 = new T01_api_method();
		m1.print1();
		
		m1.print2();
		System.out.println(m1.print2());
		int result = m1.print2();
		System.out.println(result);
		System.out.println();
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(10);
		
		int sum = m1.print6(3, 10);
		System.out.println(sum);
		
		System.out.println(m1.print6(10, 100));
		
		m1.print7("qwer",7);
		
		System.out.println(m1.print8());
	}
}
