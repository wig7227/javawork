package _05_ex;

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
	@Override
	String sound(){
		System.out.println("야옹");
		return "야옹";
	}
	
	
}
