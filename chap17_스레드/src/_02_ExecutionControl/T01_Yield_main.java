package _02_ExecutionControl;

class ThreadA extends Thread {
	boolean stop = false;		// 스레드 종료시 사용
	boolean work = true;		// yield 메소드 호출한 시점을 알기위해
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("THreadA 작업하기");
			} else {
				Thread.yield(); // 작업을 하지 않을 때 다른 스레드에게 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread {
	boolean stop = false;		// 스레드 종료시 사용
	boolean work = true;		// yield 메소드 호출한 시점을 알기위해
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("THreadB 작업하기");
			} else {
				Thread.yield(); // 작업을 하지 않을 때 다른 스레드에게 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}

public class T01_Yield_main {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		// 0.5초 동안 A,B 번갈아가면서 작업
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ta.work = false;	// 0.5초 후에는 B작업만
		System.out.println("-----------------");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ta.work = true;	// 0.5초 후에는 A,B 번갈아가면서
		
		System.out.println("-----------------");
		ta.stop = true;
		tb.stop = true;
		
	}

}
