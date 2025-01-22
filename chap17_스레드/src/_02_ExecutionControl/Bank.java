package _02_ExecutionControl;

public class Bank {
	private int balance = 5000;
	
	public int getBalnce() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}
