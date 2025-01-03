package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		System.out.println("문자열");
		System.out.println(5+8);
		// 변수 : 저장공간
		
		/* 
		   int : 정수를 저장하는 공간(4byte(32bit))
		   double : 실수를 저장하는 공간(8byte)
		   char : 문자1개(2byte, 유니코드)
		   String : 문자열 (기존에 없는 참조 자료형 이기 때문에 대문자 시작)
		*/		
		
		// 컴퓨터 언어는 2진수로 되어 있음 (0,1)
		// 1bit : 1개(0 or 1)
		// 1byte : 8bit
		
		/*자료형 변수명;
		변수명 = 값;*/
		
		int number;
		number = 3;
		//int number = 3;
		System.out.println(number);
		
		// 기존의 저장공간에 덮어쓰기
		number = 4;
		
		System.out.println(number);
		
		int number2 = 5;
		System.out.println(number);
		System.out.println(number2);
		
		// 기존의 저장공간에 덮어쓰기
		number2 = 8;
		
		System.out.println(number2);
		
		int sum = number+number2;
		System.out.println(number + "+" + number2 + "=" + (number+number2));
		System.out.println(number + "+" + number2 + "=" + sum);
		
		//새로운 저장공간 만들기(기존에 있던 저장공간과 동일이름 안됨)
		// int number =10;
		
		
		/*		과제: 
		
					1. int 저장공간을 2개 만들기
					2. 각각 5와 3을 넣기
					3. 저장공간의 각 값들을 4칙연산하여 출력하기*/
	}

}
