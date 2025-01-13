package _02_userException;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.printIn(50000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 금액 : ");
		
		try {
			int MoneyOut = sc.nextInt();
			bank.printOut(MoneyOut);
		}catch (UserException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("예외 발생");
		}
		
	}

}
