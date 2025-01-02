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
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		int random = (int)(Math.random() * 6 + 1);
		System.out.println(random);
		
		do {
			System.out.println("숫자를 입력하세요 : ");
			result = sc.nextInt();
			switch(result) {
			case result == random:
				System.out.println("반복할 횟수가 정해져 있음 떄 사용하면 좋음");
				break;
			case 2:
				System.out.println("특정 조건에 도달했을 때 break를 사용하여 종료할 때 유용");
				break;
			case 3:
				System.out.println("조건을 나중에 따지므로 무조건 1번은 실행");
			}
			
		} while(result != 0);
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
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);

			
			}
			
			
		}
		
		
		*/
		
			
		
		
		
	}

}
