package _02_ex;

import java.util.Scanner;

public class T02_Ex02 {

	public static void main(String[] args) {
		/*1.  주사위의 숫자 맞추기 게임
	    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
	    사용자로 부터 숫자 입력받아서
	    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
	    못맞췄으면 계속 물어보기
		*/
		/*
		int dice = (int)(Math.random() * 6) + 1;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			int random = sc.nextInt();
			
			if(random != dice) {
				System.out.println("떙!");
				continue;
			}
			
			else if(random == dice) {
				System.out.println("축하합니다. 맞췄습니다");
				break;
			}
				
		}
		System.out.println("프로그램 종료");
		*/
		
		
		/*
		 2. 구구단 옆으로 출력하기
	   ex)
	   2*1= 2   3*1= 3   4*1= 4   5*1= 5   6*1= 6   7*1= 7   8*1= 8    9*1= 9
	   2*2= 4   3*2= 6   4*2= 8   5*2=10  6*2=12   7*2=14   8*2=16   9*2=18 
	   ....
	   2*9=18   3*9=27  4*9=36   5*9=45  6*9=54   7*9=63   8*9=72   9*9=81  
		 */
		/*
		for (int i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.printf("%d*%d=%2d\t", j, i, j*i);  	//	\t = tab만큼 띄우시오
            }
            System.out.println();		
		}	
		*/
			
	
		//p.111 연습문제 01
		/*
		int sum = 0;
		
		//for문을 이용하여 반복 합계 연산
		
		for(int i=1;i<=100;i++) {	//for(int i=5; i<=100;i+=5)
			if(i%5 == 0)
			sum += i;
		}
		System.out.println("5의 배수의 합계는" + sum);
		*/
		
		
		
		//연습문제 02
		/*
		int evenSum = 0;
		int oddSum = 0;
		
		//for문을 이용하여 반복 합계 연산
		for (int i=1;i<=100;i+=2) {
			oddSum += i;
		}
		for (int j=2;j<=100;j+=2) {
			evenSum += j;
		}
		System.out.println("짝수의 합계는" + evenSum);
		System.out.println("홀수의 합계는" + oddSum);
		*/
		
		//연습문제 03
		/*
		for (int x=1;x<=6;x++) {
			for(int y=1;y<=6;y++) {
				if(x + y == 6) {
					System.out.printf("(%d,%d)\n",x,y);
				}
			}
		}
		*/
		
		//연습문제 04
		/*
		for (int i=1;i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		*/
		//연습문제 05
		/*
		for(int i=5;i<=5;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i == 0)
				break;
		}
		*/
		
		//연습문제 06
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<=i*2+1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		
		
		
		
		//연습문제 07
		
	
		int count = 0;
			
		while(true) {
			int dice = (int)(Math.random() * 6) + 1; 
			System.out.printf("(%d)\n",dice);
			count++;
			if(dice == 6) {
				break;
			}
			
		}
			System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
		
			
		
		
		
		
	}

}
