package _03_ex;

import java.util.Scanner;

import jdk.jshell.spi.ExecutionControl.UserException;

public class T01_ex_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		
		System.out.println("양수 2개를 입력하세요: ");
		/*
		try{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			add.Add(num1, num2);
		}catch(UserException w) {
			System.out.println(w.getMessage());
		}catch (Exception e) {
			System.out.println("예외발생");
		}
		*/
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			add.Add(num1, num2);
		} catch (NumException e) {		// 패키지가 달라도 UserException 이름이 중복되면 오류가 낳 수 있다
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}

}
