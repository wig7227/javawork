package _01_thread;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.print("|");
		}
		System.out.println("\n myThread 소요시간 : " + (System.currentTimeMillis() - T05_MultiThread.startTime));
	}
}

public class T05_MultiThread {
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		
		mt.start();
		
		long startTime = System.currentTimeMillis();
		
		
		for(int i=0; i<1000; i++) {
			System.out.print("-");
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("\n mainThread 소요시간 : " + (System.currentTimeMillis()-startTime));

	}

}
