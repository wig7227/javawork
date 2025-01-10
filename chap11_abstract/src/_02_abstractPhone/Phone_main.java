package _02_abstractPhone;

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
		
		System.out.println("----------------------------");
		
		FolderPhone fp = new FolderPhone();
		System.out.println("모델 : " + fp.model);
		System.out.println("색상 : " + fp.color);
		fp.bell();
		fp.hang();
		fp.sendVoice("hi");
		fp.receveVoice("hello");
		fp.hang();
		
		//Phone pp = new Phone("sd","sad");
		//abstract을 사용하면 객체 생성 할 수 없다
		
		
	}

}
