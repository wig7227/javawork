package _02_ExecutionControl;

public class ThreadBank extends Thread {
	Bank bank = new Bank();
	
	@Override
	public void run() {
		while(bank.getBalnce() > 0) {
			int money = ((int)(Math.random()*3) + 1)*100;
			bank.withdraw(money);
			System.out.println("잔액 : " + bank.getBalnce());
			
		}
		
		
	}

}
