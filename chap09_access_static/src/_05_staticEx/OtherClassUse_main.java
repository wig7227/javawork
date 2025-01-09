package _05_staticEx;
// 클래스이름 : 패키지이름.클래스이름.클래스이름
import _03_bank.Bank;
import _02_Car.*;
public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.printIn(9000);
		bank.printOut(8000);
		
		Ambulance ab = new Ambulance("amCar","기아");
		System.out.println(ab.model);
		ab.siren();
		ab.firstAid();
	}
}
