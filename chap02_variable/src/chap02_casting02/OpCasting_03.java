package chap02_casting02;

import java.util.Scanner;

public class OpCasting_03 {

	public static void main(String[] args) {
		/*
		// int보다 작은 자료형은 연산시 무조건 int형
		byte b1 = 10;
		short s1 =5;
		
		int result = b1 + s1;
		byte result2 = (byte)(b1 + s1);
		
		// 리터럴일떄는 연산이 아니라 다음 글자를 의미
		char c1 = 'A'+1;
		System.out.println(c1);
		
		int ch = c1+1; //연산
		char ch2 = (char)(c1+1);
		System.out.println(ch);
		System.out.println(ch2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(result3);
		
		double result4 = num1/num2;
		System.out.println(result4);
		
		double result5 = (double)num1 /num2;
		System.out.println(result5);
		*/
		
		Scanner sc = new Scanner(System.in);  // ctrl + shift + o : 자동import
				
		System.out.print("유니코드로 출력하고 싶은 문자 입력 >> ");
		char ch3 = sc.next().charAt(0);
        
        System.out.println("유니코드 : " + (int)ch3);
        
		
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'K'; 
        double idNum = iNum2 * dNum;
        char ch2 = 'K' + 1;
        
        //3.1  iNum1 / iNum2의 몫 출력
        //3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
        //3.3  iNum1의 값이 10.0으로 출력되게 하기
        //3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
        //3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
        //3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
        //3.7  ch변수의 유니코드 출력하기
        //3.8  ch변수에 1을 더해 L 이 출력되게 하시오
        
        System.out.println(iNum1 + "/" + iNum2 + "의 몫 : " + iNum1 / iNum2);
        System.out.println("iNum2 * dNum 의 결과 : " + idNum);
        System.out.println("iNum1의값" + (double)(iNum1));
        System.out.println("iNum / iNum2 의 결과 : " + (double)(iNum1 / iNum2));
        System.out.println("iNum1 / fNum 의 결과 : " + (int)(iNum1 / fNum));
        System.out.println("iNum1 / fNum 의 결과 : " + (iNum1 / (double)fNum));
        System.out.println("ch변수의 유니코드 : " + (int)ch);
        System.out.println("ch변수에 1을 더한 유니코드 : " + ch2);
      
        
        
        
        
        
	}
}
