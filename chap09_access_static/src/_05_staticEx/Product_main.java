package _05_staticEx;

public class Product_main extends Product{

	public static void main(String[] args) {
		Product p1 = new Product(); //고유한 제품번호(더조은1)
		Product p2 = new Product(); //고유한 제품번호(더조은2)
		Product p3 = new Product(); //고유한 제품번호(더조은)
		//출력문: 셍산된 총 제품의 갯수 : 3
		
		/*int random = (int)(Math.random() * 10000);
		int random1 = (int)(Math.random() * 10000);
		int random2 = (int)(Math.random() * 10000);
		int random3 = (int)(Math.random() * 10000);
		int random4 = (int)(Math.random() * 10000);*/
		
		p1.Product(12345);
		p2.Product(13579);
		p3.Product(22222);
		p3.Product(24680);
		p3.Product(88888);
		
		System.out.println("생산된 총 제품의 갯수 : " + count);
	}

}
