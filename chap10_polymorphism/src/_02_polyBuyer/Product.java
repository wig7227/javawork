package _02_polyBuyer;

public class Product {
	//price
	//bonusPoint
	//생성자(price)
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price*0.05);
	}
	
}
