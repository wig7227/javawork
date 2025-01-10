package _02_abstractPhone;

abstract public class Phone {
	String model;
	String color;
	String message;
	String search;
	
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("따르릉");
	}
	//boolean hang;
	abstract void hang();
		/*if(hang = !hang) {
			System.out.println("전화 받았습니다");
		}
		else
			System.out.println("전화 끊습니다");*/
	

	
	void sendVoice(String message) {
		System.out.println(message);
	}
	
	void receveVoice(String message) {
		System.out.println(message);
	}
	
	

}
