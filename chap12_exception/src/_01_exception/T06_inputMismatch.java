package _01_exception;
import java.util.InputMismatchException;
// InputMismatchException : 사용자로부터 입력받았는데 자료형이 맞지 않을 때
import java.util.Scanner;

public class T06_inputMismatch {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int sum = 0;
		try {
			
			for(int i=1; i<=3; i++) {
				System.out.print(i + "번쨰 정수 입력 : ");
				int num = sc.nextInt();
				sum += num;
			}
		}catch(InputMismatchException ime) {
			System.out.println("정수만 입력 가능");
		}
		System.out.println("합계" + sum);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int sum = 0;
		
			for(int i=1; i<=3; i++) {	
				System.out.print(i + "번쨰 정수 입력 : ");
				
				try {
					int num = sc.nextInt();
					sum += num;
				}catch(InputMismatchException ime) {
					System.out.println("정수만 입력 가능");
					sc.next();
					i--;
				}
				
			}
			
			System.out.println("합계" + sum);
			
		
	}

}
