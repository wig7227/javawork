package _02_ExecutionControl;

public class T03_Bank_main {

	public static void main(String[] args) {
		Runnable r = new ThreadBank();
		
		/*Thread th2 =  new Thread(new ThreadBank());
		Thread th3 =  new Thread(new ThreadBank());
		
		th2.start();
		th3.start();*/
		
		new Thread(r).start();
		new Thread(r).start();
	}

}
