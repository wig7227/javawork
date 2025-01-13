package _08_interfacePolymorphism_인터페이스다형성;
/*
 * interface 다형성
 * - interface는 객체 생성 안됨
 * - interface를 상속받은 클래스를 객체생성하여 그 객체를 interface타입으로 형변환
 */
public class Product_main {

	public static void main(String[] args) {
		// interface는 객체 생성 안됨
		//Product product = new Product();
		
		Product product = new Game();	//형변환 가능
		System.out.print(product + " ");
		product.power();
		System.out.print(product + " ");
		product.power();
		//System.out.println(product.volume(""));  void 문이라서 출력문 오류
		
		System.out.println("----------------------");
		
		product = new Tv();
		System.out.print(product + " ");
		product.power();
		System.out.print(product + " ");
		product.power();
	}
}
