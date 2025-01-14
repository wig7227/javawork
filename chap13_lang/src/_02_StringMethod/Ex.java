package _02_StringMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 무엇을 도와 드릴까요?");
		String str = sc.next();
		
		if(str == "검색");
			System.out.println("dd");*/
		
		int num [] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		

		
		for(int i : num) {
			int n = sc.nextInt();
			num[i] = n;
			System.out.print(num[i] + " ");
			
			//System.out.println(Arrays.toString(num));
		}
		

			

	}

}
