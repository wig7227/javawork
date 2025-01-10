package _02_abstractPhone;

public class SmartPhone extends Phone {
	SmartPhone(){
		super("iphone","white");
	}
	
	SmartPhone(String model,String color){
		super(model, color);
	}
	
	SmartPhone(String model){
		this("샘성","검정");
	}
	
	void search(String search) {
		System.out.println(search);
	}
	
	boolean hang;
	@Override
	void hang() {
		if(hang = !hang) {
			System.out.println("전화 버튼을 드래그 해서 전화 받기");
		}
		else
			System.out.println("끊기 버튼을 눌러 전화 끊기");
	}
}
