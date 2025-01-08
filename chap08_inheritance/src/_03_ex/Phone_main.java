package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		sp.bell();
		sp.hang();
		sp.sendVoice("안녕하세요?");
		sp.receveVoice("네 맞습니다");
		sp.hang();
		sp.search("자바 검색");
		
		SmartPhone sp1 = new SmartPhone("삼성","검정");
		
		System.out.println(sp1.model);
		
		SmartPhone sp2 = new SmartPhone("dd");
		
		System.out.println(sp2.model);
		System.out.println(sp2.color);
	}

}
