package _06_interfaceDefault;

public class InterClass2 implements Inter {

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String me() {
		return "클래스에서 오버라이딩";
	}

	@Override
	public String me2() {
		return "me2() : 클래스에서 오버라이딩";
	}
	
	/*@Override
	public String stMe() {	//static이 붙은 메소드는 오버라이딩 할 수 없다
		return "오버라이딩";
	}*/
}
