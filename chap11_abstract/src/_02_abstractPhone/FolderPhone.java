package _02_abstractPhone;

public class FolderPhone extends Phone {
	FolderPhone(){
		this("실버폰","검정");
	}
	
	FolderPhone(String model,String color){
		super(model,color);
	}

	
	
	boolean hang;
	@Override
	void hang() {
		if(hang = !hang) {
			System.out.println("폴더를 열고 통화 버튼을 눌러 전화 받기");
		}
		else
			System.out.println("전원 버튼을 눌러 통화를 끊고 폴더 닫기");
	}
	
	
}
