package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		int num1 = 1234567;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		//jave에서 정수의 기본자료형 double
				float float1 = (float)5.345;
		
		// java에서 정수의 기본자료형 int 
		long long1 = 345611117111132213L;
		float flo2 = long1;	//자동형변환
		
		//char : 0~65535
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
	}

}
