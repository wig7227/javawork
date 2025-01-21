package _01_generic;
class Box2<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}
class Apple2 {
	int num = 10;
}
class Banana2 {
	boolean bool = true;
}
public class T02_Generic {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("김길동");
		String str = box.get();
		System.out.println(str);   // String클래스는 toString을 오버라이딩 해놓은 상태
		
		Box2<Apple2> apple = new Box2<>();
		apple.set(new Apple2());
		Apple2 app = apple.get();
		System.out.println(app.num);
		
		Box2<Banana2> banana = new Box2<>();
		banana.set(new Banana2());
		Banana2 bana = banana.get();
		System.out.println(bana.bool);

	}

}
