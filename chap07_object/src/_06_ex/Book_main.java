package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println("b1의 정보 : ");
		System.out.println(b.pr);
		System.out.println(b.name);
		System.out.println(b.ISBN);
		
		System.out.println("--------------------");
		
		System.out.println("b2의 정보 : ");
		Book b2 = new Book("oracle", 90329);
		System.out.println(b2.pr);
		System.out.println(b2.name);
		System.out.println(b2.ISBN);

	}
}
