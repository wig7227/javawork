package _02_userException;

public class Bank {
	//private 잔액 : 필드
	//입금 메서드
	//출금 메서드
	//getter 메서드 잔액 필드
	private int bal;
	
	
	public void printIn(int MoneyIn) {
		System.out.println(MoneyIn + "원 입급 완료 헀습니다");
		
		bal += MoneyIn;
		System.out.println("잔액 " + bal);
	}
	
	public void printOut(int MoneyOut) throws UserException {
		
		if(MoneyOut <= bal) {
			bal -= MoneyOut;
			System.out.println(MoneyOut + "원 출금 완료 했습니다");
		}
		else {
			throw new UserException("잔고 부족 : " + (MoneyOut-bal) + "모자람");
		}
	}
	
	public int bal() {
		return bal;
	}
	
}
