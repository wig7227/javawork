package _04_polyBuyer.ArrayList;

public class Tv extends Product{
	//생성자
	//부모의 생성자에 가격 넘겨주기
	Tv(){
		super(140);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
