package _05_ex;

public class Pet_main {

	public static void main(String[] args) {
		/*main :     PetRun
		 Pet pet1 = new Cat()
		 Pet pet2 = new Dog()*/
		
		Pet pet1 = new Pet();
		
		Pet pet2 = new Cat("믹스","삼색","사나움");
		
		Pet cat = new Cat();
		Pet dog = new Dog();
		Pet frog = new Frog();
		
		pet2.info();
		
		cat.info();
		dog.info();
		frog.info();
		
		cat.sound();
		dog.sound();
		frog.sound();
		
		System.out.println("종류 : " + pet1.getKind("먼치킨"));
		
		pet2.sound();
		
		pet1.sound();
		
		
	}

}
