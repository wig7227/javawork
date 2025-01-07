package _02_Car;

public class Car_main {

	public static void main(String[] args) {
		Ambulance am1 = new Ambulance();
		
		am1.power();
		System.out.println("현재 속도 : " + am1.speedUp());
		System.out.println("현재 속도 : " + am1.speedUp());
		am1.siren();
		am1.firstAid();
		am1.siren();
		am1.power();
		
	}

}
