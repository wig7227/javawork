package _01_abstract;

public class Dog extends Pet{
	Dog(String kind,String color,String feature){
		super (kind,color,feature);
	}
	
	public Dog() {
		this ("푸들","갈색","밝은");
	}
	
	@Override
	void sound(){
		System.out.println("멍멍");
		
	}
	
}
