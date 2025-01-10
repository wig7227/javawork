package _04_polyBuyer.ArrayList;

public class Computer extends Product{
	//생성자
	//부모의 생성자에 가격 넘겨주기
	Computer(){
		super(150);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

//Computer c = new Computer();
//System.out.println(c)  ->toString() 호출 return 패키지이름.클래스이름@주소