package _03_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		  while(조건식){
		  		조건식이 참인동안 계속 실행
		  }
		  * 반복문에서 같이 사용
		  -break : 반복문을 빠져 나올 때
		  -continue : continue뒤의 구문은 실행하지 않고 다시 반복문 실행
		 */
		// for문을 while문으로
		// 출력 1 2 3 4 5
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}	
		*/
		//for문은 조건이 제한적이거나 정해져있을때 ex) 
		//while문은 조건이 정해져있지 않을때 ex) 
		int i = 1;	// 초기식
		while(i<=5) {	// 조건식
			System.out.println(i);
			i++;	// 증감식
		}
		
		System.out.println("---------------");
		
		i = 1;
		int sum = 0;
		while(i<=10) {
				sum += i++;

		}
		System.out.println(sum);
		
		System.out.println("---------------");
		
		i = 1;
		sum = 0;
		while(i<=10) {
				sum += ++i;

		}
		System.out.println("2~11 까지 합계 : " + sum);
		
		// break
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5) {
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자1개 입력(멈추려면 'q'입력) : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q')
				break; // 반복문을 끝낸다
			
			System.out.println(ch);
		}
		System.out.println("프로그램 종료");
			
		sum = 0;
		int j=1;
		for(j=1; j<=10;j++) {
			sum += j;
		
			if(sum >= 10)
				break;
		}
		System.out.println(j + "까지의 합 : " + sum);
		
		System.out.println("---------------");
		System.out.println("---------------");
		
		// continue  (특정 조건을 제외 시킬때 사용)
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		// 1+2+4+5+7+8+10+11+13...
		sum = 0;
		for(int k=1; k<=100;k++) {
			if(k%3 == 0) {
				continue;
			}
			sum += k;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계  : " + sum);	
			
		
	}

}
