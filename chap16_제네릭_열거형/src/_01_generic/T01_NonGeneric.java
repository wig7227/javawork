package _01_generic;
class Box3 {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
class Apple3 {
	int num = 10;
}
class Banana {
	boolean bool = true;
}
public class T01_NonGeneric {

	public static void main(String[] args) {
		Box3 box = new Box3();
		box.setObj("김길동");
		Object obj = box.getObj();
		System.out.println(obj);   // String클래스는 toString을 오버라이딩 해놓은 상태
		
		box.setObj(new Apple());
		Apple3 obj2 = (Apple3)box.getObj();
		System.out.println(obj2.num);
		
		box.setObj(new Banana());
		Banana b = (Banana)box.getObj();
		System.out.println(b.bool);

	}

}
