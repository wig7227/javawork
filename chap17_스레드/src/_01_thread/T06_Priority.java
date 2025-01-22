
package _01_thread;

class Thread3 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<50; i++) {
			System.out.print("영");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread4 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<50; i++) {
			System.out.print("차");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class T06_Priority {

	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		System.out.println("우선순위가 가장 높은 값  : " + Thread.MAX_PRIORITY);	// 10 : 우선순위가 가장 높음
		System.out.println("우선순위가 가장 낮음 값  : " + Thread.MIN_PRIORITY);	// 1 : 우선순위가 가장 낮음
		System.out.println("우선순위가 default 값  : " + Thread.NORM_PRIORITY);	// 5 : default 값
		System.out.println("");
		
		t3.setPriority(10);
		t4.setPriority(1);
		System.out.println("우선순위(영) : " + t3.getPriority());
		System.out.println("우선순위(차) : " + t4.getPriority());
		
		t3.start();
		t4.start();
	}

}
