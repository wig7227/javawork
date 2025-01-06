package _02_method;

public class T01_api_op {
	// 5칙 연산
	
	// 메소드 4개
	// +,-,&,% = 반환형 int 형
	//  /	= 반환형 double형
	
	//매개변수 int형으로 2개 받기
	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	double div(double num1, double num2) {
		return num1 / num2;
	}
	int per(int num1, int num2) {
		return num1 % num2;
	}
	
}
