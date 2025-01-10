package _01_abstract;
/*
 * 추상클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다
 * 
 */

public class Cat extends Pet{
	/*Cat (Pet상속)
	   // 생성자 2개
	   Cat() { 매개변수3개인 생성자에 값 넘겨주기}
	   Cat(kind, color, feature) { }
	   // 오버라이딩
	   sound()
	  Dog (Pet상속)
	  Frog (Pet상속)*/
	

	Cat(String kind,String color,String feature){
		super (kind,color,feature);
	}
	
	Cat() {
		this ("페르시안","검정","도도");
	}
	/*@Override
	void sound(){
		System.out.println("야옹");
	}*/

	
	//추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야함
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	
}
