package _03_ex;

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
}
