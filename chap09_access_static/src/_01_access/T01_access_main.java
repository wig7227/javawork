package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		ac.num = 10;
		System.out.println(ac.num);
		
		System.out.println(ac.PI);
		
		// ac.name = "김태형";
		// System.out.println(ac.name);
		ac.setName("김태형");
		String name = ac.getName();
		System.out.println(ac.getName());
	}

}
