package _02_polyBuyer;

public class Buyer {
	int money = 500;
	int bonusPoint;

	/*	제품의 갯수만큼 오버로딩을 해야함
		void buy(Computer com){
			
		}
		void buy(Tv tv) {
			
		}
		void buy(GameDevice gd) {
			
		}
		*/
	//형변환을 하면 모든 제품을 다 받을 수 있다
	//매개변수로 객체를 받음
	
	//매개변수로 객체를 받음 반환형 메서드이름(클래스명 변수명)
	//-> 인자값은 반드시 클래스명으로 생성된 객체만 넘겨줘야 한다
	// 그러면 객체의 주고사 넘어와서 변수명에 저장됨
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}

//메소드안에 객체는 객체 생성 안하고 그대로 사용할 수 있나
//toString 쓰는 이유 주소 대신 객체 출력하고 싶어서  //강제형변환을 할꺼면 toString을 꼭 써줘야하나
//오버 라이딩 하는 이유 a.오버라이딩하면 무조건 자식 클래스를 출력함
//생성자와 메소드의 차이