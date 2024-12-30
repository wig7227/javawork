package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2째자리까지(반올림)) 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 수학, 컴퓨터 점수 입력 (띄어쓰기로 구분)>> ");
        double kor = sc.nextDouble();
        double mat = sc.nextDouble();
        double com = sc.nextDouble();
        
        double sum = (kor + mat + com);
        double avg = sum / 3.0;
        
        System.out.println("총점 :  " + sum);
        System.out.printf("\n평균 : %.2f\n", avg);
        
	}

}
