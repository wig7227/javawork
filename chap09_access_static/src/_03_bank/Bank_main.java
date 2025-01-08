package _03_bank;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("입금을 원하시면 '1' 입력, 출금을 원하시면 '2' 입력, 잔액을 확인하고 싶으면 '3' 입력: ");
			int result = sc.nextInt();
			
			if(result == 1) {
				System.out.println("입금할 금액을 입력하세요 : " );
				int MoneyIn = sc.nextInt();
				bank.printIn(MoneyIn);
			}
			if(result == 2) {
				System.out.println("출금할 금액을 입력하세요 : " );
				int MoneyOut = sc.nextInt();
				bank.printOut(MoneyOut);
			}
			if(result == 3) {
				System.out.println("남은 잔액 : " + bank.bal());
			}
		
		}
		
	}

}
