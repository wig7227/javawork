package _08_interfacePolymorphism_인터페이스다형성;

public class Game implements Product{

	boolean pw;
	@Override
	public void power() {			//void 문은 반환형이라서 출력문을 사용할 수 없음
		if(pw = !pw) {
		System.out.println("on");
	}
	else
		System.out.println("off");
		
	}

	public void volume(int vol) {
		System.out.println("볼륨 : " + vol);
	}
	
	String channel(String game) {
		System.out.println("현재 게임 : " + game);
		return game;
	}

	int vol;
	public void volume(String button) {
		if (button == "up") {
			vol += 1;
		}
		if (button == "down") {
			vol -= 1;
		}
		if (vol < 0) {
			vol = 0;
		}
		System.out.println("볼륨 : " + vol);
	}
	
	@Override
	public String se(String se) {
		System.out.println("검색 : " + se);
		if (se == "게임 검색")
			System.out.println("게임 컨텐츠: 마리오카트\n\t  별의 커비\n\t  놀러와요 동물의숲");
		return se;
	}
	
	public String ai() {
		System.out.println("안녕하세요 무엇을 도와드릴까요?");
		System.out.println("'게임 검색'을 입력하면 게임 목록을 확인 할 수 있습니다");
		return "ai";
		
	}
	
	@Override
	public String toString() {	// class의 최상위 클래스 Object에 있는 메소드
		return "game";
	}
	
	//다른게임으로 전환하기
}
