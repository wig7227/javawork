package _03_ex;

import java.util.Scanner;

import jdk.jshell.spi.ExecutionControl.UserException;

public class T01_ex_main {

	public static void main(String[] args) throws UserException {
		Scanner sc = new Scanner(System.in);
		
		Add add = new Add();
		
		
		
		System.out.println("양수 2개를 입력하세요: ");
		try{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println();
			add.Add(num1, num2);
		
		
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
	}

}
