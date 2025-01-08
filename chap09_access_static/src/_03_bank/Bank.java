package _03_bank;

public class Bank {
	//private 잔액 : 필드
	//입금 메서드
	//출금 메서드
	//getter 메서드 잔액 필드
	private int bal;
	
	
	void printIn(int MoneyIn) {
		System.out.println(MoneyIn + "원 입급 완료 헀습니다");
		
		bal += MoneyIn;
		System.out.println("잔액 " + bal);
	}
	
	void printOut(int MoneyOut) {
		
		bal -= MoneyOut;
		
		if(MoneyOut <= bal) {
		System.out.println(MoneyOut + "원 출금 완료 했습니다");
		}
		if(MoneyOut > bal) {
			System.out.println("잔액이 부족합니다");
		}
	}
	int bal() {
		return bal;
	}
	
}
