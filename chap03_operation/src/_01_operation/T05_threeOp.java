package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자
		/*
		  조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		 */
		/*
		int num1 = 10;
		int num2 = 17;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
		
		System.out.println("num2의 숫자는 num1의 숫자보다");
		char re1 = num1 < num2 ? '소' : '대';
		System.out.println(re1);
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		
		//사용자로부터 점수를 입력받아 80점 이상이면 합격 그렇지 않으면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 : ");
		
		int score = sc.nextInt();
		
		String re3 = score >= 80 ? "합격" : "불합격";
		System.out.println("시험에" + re3 + "했습니다.");
		
		String re4 = score >= 90 ? "최우수" : score >= 80 ? "우수" : "불합격";
		System.out.println(re4);
		*/
		
		
		/*
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 : ");
		
		int score = sc2.nextInt();
		
		String re5 = score < 0 ? "잘못입력했습니다." : score > 100 ? "잘못입력했습니다." : score >= 90 ? "A학점" : 
					 score >= 80 ? "B학점" : score >= 70 ? "C학점" : score >= 60 ? "D학점" : "F학점" ;
		System.out.println("당신의 학점은" + re5);
		*/
		
		
		
		
		
		
		
		//1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		
		int int1 = sc.nextInt();
		
		String re = int1 > 0 ? "양수입니다" : "양수가 아닙니다.";
		
		System.out.println(re);
		*/
		
		
		
		//2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		/*
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		
		int int2 = sc2.nextInt();
		
		String re2 = int2 > 0 ? "양수입니다" : int2 < 0 ? "음수입니다." : "0 입니다";
		
		System.out.println(re2);
		*/
		
		
		
		//3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		/*
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		
		int int3 = sc3.nextInt();
		
		String re3 = int3 % 2 == 0  ? "짝수입니다" :  "홀수입니다.";
		
		System.out.println(re3);
		*/
		
		
		/*
		4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
		   사용자로부터 인원수와 사탕의 갯수를 입력받아
		   1인당 동일하게 나눠가진 사탕 개수와
		   나눠주고 남은 사탕 갯수를 출력하기
		*/
		/*
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요 : ");

		int int4 = sc4.nextInt();
		
		
		Scanner candy4 = new Scanner(System.in);
		
		System.out.println("사탕의 갯수를 입력하세요 : ");
		
		int candy = candy4.nextInt();
		
		System.out.println("나눠가진 사탕 개수 :" + candy / int4);
		
		System.out.println("나눠주고 남은 사탕 갯수 : " + candy % int4 );
		*/
		
		
		
		
		
		
		
		/*
		5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
				이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
				
				ex.
				이름 : 이준기
				학년(숫자만) : 2
				반(숫자만) : 7
				번호(숫자만) : 3
				성별(M/F) : M
				성적(소수점 둘째 짜리까지) : 97.35
				
				2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		*/
		/*
		Scanner name5 = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");

		String name = name5.next();
		
		
		Scanner grade5 = new Scanner(System.in);
		
		System.out.println("학년을 입력하세요(숫자만) : ");

		int grade = grade5.nextInt();
		
		
		Scanner classs5 = new Scanner(System.in);
		
		System.out.println("반을 입력하세요(숫자만) : ");

		int classs = classs5.nextInt();
		
		
		Scanner number5 = new Scanner(System.in);
		
		System.out.println("번호를 입력하세요(숫자만) : ");

		int number = number5.nextInt();
		
		
		Scanner gender5 = new Scanner(System.in);
		
		System.out.println("성별(M/F)을 입력하세요 : ");

		char gender = gender5.next().charAt(0);
		
		
		Scanner score5 = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요(소수점 둘째 자리까지) : ");

		double score = score5.nextDouble();
		
		System.out.printf("이름: " + name + "\n학년: " + grade + "\n반: " + classs + "\n번호" + number + "\n성별: " + gender + "\n성적" +"%.2f\n", score);
		
		
		char genderRe = gender == 'M' ? '남' : '여';
		
		System.out.printf("%d학년 %d반 %d번 %s %s 학생의 성적은\n성적 %.2f이다.\n", 
                		grade, classs, number, name, genderRe, score);
		*/
		
		
		
		
		/*
		6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		    14세~19세 이하이면 청소년
		    20세 이상이면 성인으로 출력하시오
		*/
		/*
		Scanner sc6 = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");

		int age6 = sc6.nextInt();
		
		String re6 = age6 <= 13 ? "어린이입니다" : age6 <= 19  ? "청소년입니다" : "성인입니다" ; 
		
		//age <= 13 ? "어린이" : age >= 14 && age <= 19 ? "청소년" : "성인" ;     (논리곱 사용)
		
		System.out.println(re6);
		*/
		
		
		/*
		7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		*/
		/*
		Scanner sc7 = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요 (띄어쓰기로 구분) >> ");
		int kor = sc7.nextInt();
		int eng = sc7.nextInt();
		int mat = sc7.nextInt();
		
		double avg = (kor + eng + mat) / 3.0;
		
		String re7 = kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? " 합격" : "불합격";
		
		System.out.println(re7);
		*/
		
		
		
		
		
		
		/*
		8. 주민번호를 입력받아 남자인지 여자인지 출력하기
				
				ex.
				주민번호를 입력하세요(- 포함) : 123456-3123456
		 */
		/*
		Scanner sc8 = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		
		char num8 = sc8.next().charAt(7);
		
		String re8 = num8 == '1' || num8 == '3' ?  "남자" : "여자";
		System.out.println(re8);
		*/
		
				
				
		/*
		9.  사용자로부터 두 개를 입력 받고(num8, num9에 저장)
		    또 다른 정수를 입력 받아 그 수가 num8 이하거나 num9 초과이면 true를 출력하고
		    아니면 false를 출력하세요. (단, num8은 num9보다 작아야 함)
		 */
		
		Scanner sc9 = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요 (첫번째 정수는 두번쨰 정수보다 작은 숫자이여야 함) >> ");
		
		int num8 = sc9.nextInt();
		int num9 = sc9.nextInt();
		
		Scanner sc9_2 = new Scanner(System.in);
		
		System.out.println("또 다른 정수를 입력하세요");
		
		int num10 = sc9_2.nextInt();
		
		boolean re9 = num10 <= num8 || num10 > num9;
		System.out.println(re9);
		
		
		
	
		    
		    
		    
		 
		//10. 사용자로부터 3개의 수를 키보드로 입력 받아 
    	//입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		
		
		Scanner sc10 = new Scanner(System.in);
		
		System.out.println("3개의 정수 입력 : ");
		int num11 = sc10.nextInt();
		int num12 = sc10.nextInt();
		int num13 = sc10.nextInt();
		
		boolean re10 = num11 == num12 && num11 == num13;
		
		System.out.println("3개의 숫자가 모두 같은가? " + re10);
		
		
		
	}

}
