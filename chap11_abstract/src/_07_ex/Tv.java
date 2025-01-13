package _07_ex;

public class Tv implements Product {
	boolean pw;
	@Override
	public void power() {
		if(pw = !pw) {
		System.out.println("on");
	}
	else
		System.out.println("off");
		
	}
	
	/*int vol = 0;
	public void volume(String bu) {
		
		System.out.println("볼륨 : " + vol);
		if (bu == "up") {
			vol++;
		}
		if (bu == "down") {
			vol--;
		}
	}*/
	
	public void volume(int vol) {
		System.out.println("볼륨 : " + vol);
	}
	
	int vol = 0;
	public void volume(String button) {
		switch(button) {
		case "up" : vol++;
		break;
		case "down" : vol--;
		break;
		}
		if (vol < 0) {
			vol = 0;
		}
		System.out.println("볼륨 : " + vol);
	}
	
	
	
	int channel(int channel) {
		System.out.println("현재 채널 : " + channel);
		return channel;
	}
	
	
	@Override
	public String se(String se) {
		System.out.println("검색 : " + se);
		if (se == "드라마 검색")
			System.out.println("추천 컨텐츠: 별들에게 물어봐\n\t  오징어 게임2");
		return se;
	}
	
	public String ai() {
		System.out.println("안녕하세요 무엇을 도와드릴까요?");
		System.out.println("'드라마 검색'을 입력하면 드라마 컨텐츠를 확인 할 수 있습니다");
		return "ai";
		
	}
	
	//채널 매개변수로 받아서 올리고 내리기






		
	
}
