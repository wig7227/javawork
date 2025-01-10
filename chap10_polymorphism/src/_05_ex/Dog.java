package _05_ex;

public class Dog extends Pet{
	Dog(String kind,String color,String feature){
		super (kind,color,feature);
	}
	
	public Dog() {
		this ("푸들","갈색","밝은");
	}
	
	@Override
	String sound(){
		System.out.println("멍멍");
		return "멍멍";
	}
	
}
