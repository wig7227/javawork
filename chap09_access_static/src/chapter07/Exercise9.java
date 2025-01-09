package chapter07;
class Exercise{
	private static Exercise exer = new Exercise();
	
	private Exercise() {
		System.out.println();
	}
	public static Exercise getInstance() {
		return exer;
	}
}


public class Exercise9 {

	public static void main(String[] args) {

		Exercise ex1 = Exercise.getInstance();
		Exercise ex2 = Exercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}

}
