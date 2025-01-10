package _05_ex;

public class Frog extends Pet{
	Frog(String kind,String color,String feature){
		super (kind,color,feature);
	}
	
	Frog() {
		super ("청개구리","초록","활발");
	}
	
	@Override
	String sound(){
		System.out.println("개굴");
		return "개굴";
	}
	
}
