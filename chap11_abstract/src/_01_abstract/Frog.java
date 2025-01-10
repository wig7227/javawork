package _01_abstract;

public class Frog extends Pet{
	Frog(String kind,String color,String feature){
		super (kind,color,feature);
	}
	
	Frog() {
		super ("청개구리","초록","활발");
	}
	
	@Override
	void sound(){
		System.out.println("개굴");
	}
	
}
