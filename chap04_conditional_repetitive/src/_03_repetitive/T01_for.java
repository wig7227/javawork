package _03_repetitive;

public class T01_for {

	public static void main(String[] args) {
		/*
		 * 반복문 : 원하는 갯수 또는 조건이 맞을떄까지 반복하여 실행하고자 할 때
		  1. for : 원하는 갯수 만큼 반복 실행
		  	for(초기식; 조건식; 증감식){
		  		실행문
		  	}
		  2. while : 조건이 맞을 때까지 반복 실행
		  3. do ~ while
		 */
		
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("============================");
		
		for(int i=1; i<=10; i++) {
			System.out.println("어서오세요");
		}
		System.out.println("============================");
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + ".축하합니다");
		}
		System.out.println("=============================");
		
		for(int i=100; i>=1; i--) {
			System.out.println(i + ".제하하하하하하");
		}
		System.out.println("=============================");
		
		for(int i=1; i<=100; i+=2) { // i = i+2
			System.out.println(i + ".2씩 증가");
		}
		System.out.println("=============================");
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;	// sum = sum + i	
			System.out.println("합계 : " + sum);
		}
		System.out.println("1~10의 합계 : " + sum);
		
	}

}
