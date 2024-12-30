package _01_operation;

import java.util.Scanner;

public class T04_logical {

	public static void main(String[] args) {
		
		// 논리곱과(and) 논리합(or)
		/*
		 x	y	논리곱(&&)	논리합(||)
		 0	0		0			0
		 0	1		0			1
		 1	0		0			1
		 1	1		1			1
		 */
		/*
		int num1 = 10;
		int num2 = 20;
		boolean result = num1==num2 && num2>num1;
							// f(0)	&& t(1)
		System.out.println(result);
		
		result = num1==num2 || num2>num1;
		System.out.println(result);
		System.out.println("--------------------------------------------");
		
		// ! : not
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		
		// A : 65~90, a: 97
		char ch1 = 'I';
		System.out.println(ch1);
		System.out.println("대문자인가?" + (ch1 >= 'A' && ch1 <= 'Z'));
		System.out.println("소문자인가?" + (ch1 >= 'a' && ch1 <= 'z'));
		*/
		/*
		ch1 >= 65 && ch1 <= 90
		ch1 <= 90
		65, 66, 67... 90, 91,..
		
		ch1 <= 'Z'
		...,63, 64, 65,...89, 90
		*/
		
		/*
		1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

		   ex.
		   이름을 입력하세요 : 아무개
		   성별을 입력하세요(남/여) : 남
		   나이를 입력하세요 : 20
		   키를 입력하세요(cm) : 180.5

		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		*/
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		System.out.println("성별을 입력하세요(남/여) : ");
		String sex = sc.next();
		System.out.println("이름 : " + sex);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.println("키를 입력하세요 : ");
		Double heg= sc.nextDouble();
		System.out.println("키 : " + heg);
		*/
		
		/*
		2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		   ex.
		   첫 번째 정수 : 23
		   두 번째 정수 : 7

		   더하기 결과 : 30
		   빼기 결과 : 16
		   곱하기 결과 : 161
		   나누기 몫 결과 : 3
		*/
		/*
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int int1 = sc2.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int int2 = sc2.nextInt();
		
		System.out.println("더하기 결과 : " + (int1 + int2));
		System.out.println("뺴기 결과 : " + (int1 - int2));
		System.out.println("곱하기 결과 : " + (int1 * int2));
		System.out.println("나누기 몫 결과 : " + (int1 / int2));	
		*/
		/*
		3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		   계산 공식 ) 면적 : 가로 * 세로
			     둘레 : (가로 + 세로) * 2

		   ex.
		   가로 : 13.5
		   세로 : 41.7

		   면적 : 562.95
		   둘레 : 110.4
		*/
		/*
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double d1 = sc3.nextDouble();
		
		System.out.println("세로 : ");
		double d2 = sc3.nextDouble();
		
		System.out.println("면적 : " + (d1 * d2));
		System.out.println("둘레 : " + (d1 + d2) * 2);
		*/
		
		
		/*
		4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.

		   ex.
		   문자열을 입력하세요 : apple

		   첫 번째 문자 : a
		   두 번째 문자 : p
		   세 번째 문자 : p
		*/
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc4.next();
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		
		System.out.println("첫번째 문자 : " + first);
		
		System.out.println("두번째 문자 : " + second);
		
		System.out.println("세번째 문자 : " + third);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
