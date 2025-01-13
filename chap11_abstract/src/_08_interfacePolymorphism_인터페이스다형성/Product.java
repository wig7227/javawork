package _08_interfacePolymorphism_인터페이스다형성;

interface ai{
	static String ai() {
		return "안녕하세요";
	}
}

interface search{
	default String se(String se) {
		return "검색";
	}
}

public interface Product extends ai, search{
	//메서드: 전원켜고 끄기
	//볼륨 매개변수로 받아서 올리고 내리기
	void power();
	
	void volume(String button);

	/*	interface  product
	* 나중에 추가하는 메소드
		- AI와 대화할 수 있는 메소드 : 구현부 있음. 오버라이딩 안됨
		- 검색할 수 있는 메소드 : 구현부 있음. 오버라이딩 가능
	
	class : Tv  (product상속)
		검색할 수 있는 메소드 오버라이딩 하기*/
	
	
	//void 와 변수return의 차이
	//override 하고 안하고 차이
	//toString
}
