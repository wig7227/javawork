package _05_staticEx;

public class Product {
	//고유의 제품번호(더조은1
	//제품의 갯수(객체가 생성된 갯수)
	static int count;
	int proNum;
	
	void ProNum(int num){
		System.out.println(num + "더조은" + ++count);
	}
}
