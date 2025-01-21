package _01_thread;

public class T04_SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			System.out.print("미");
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("소요시간 : " + (endTime-startTime));
	}

}
