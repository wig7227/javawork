package _04_polyBuyer.ArrayList;

public class GameDevice extends Product{
	//생성자
	//부모의 생성자에 가격 넘겨주기
	GameDevice(){
		super(50);
	}
	@Override
	public String toString() {
		return "GameDevice";
	}
}