package chap02_variable;

public class Fommat_07 {

	public static void main(String[] args) {
		String url = "www.google.com";
		// java에서 실수형은 doubla이 기본자료형
		// 실수형 숫자를 그냥 쓰면 double형으로 인식 (float을 쓸때 0.10을 넣으면 8byte를 4byte에 넣으라고 해서 오류가 뜸)
		float f1 = .10f;
		double d1 = 1234523.123456789345;
		System.out.printf("%d, %d, %d\n", 10, 5, 1);
		System.out.printf("%f\n", 1.23456789);
		System.out.printf("%f\n", f1);
		System.out.printf("%8f\n", d1);
		System.out.printf("%4.2f\n", d1);
		System.out.printf("%.2f\n", d1);	//가장 많이씀
		
		System.out.printf("--------------------------\n");
		
		System.out.printf("%s", url);
		System.out.printf("글씨\n");
		
		System.out.printf("%20s\n", url); // 오른쪽 정렬
		
		System.out.printf("%-20s", url);
		System.out.printf("글씨\n");
		
		System.out.printf("%.8s\n", url);	// 왼쪽에서 8글자만 출력
		
		System.out.printf("--------------------------\n");
		
		int octNum = 010;	//십진수 : 8
		int hexNum = 0x10;	//십진수 : 16
		int binNum = 0b10;	//십진수 : 2
		
		System.out.printf("8진수 = %o은 10진수 = %d\n", octNum, octNum);
		System.out.printf("16진수 = %x은 10진수 = %d\n", hexNum, hexNum);
		System.out.printf("%X\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("2진수 = %s은 10진수 = %d\n", Integer.toBinaryString(binNum), binNum);
		
		System.out.printf("--------------------------\n");
		
		int num = 77;
		String a2 = Integer.toBinaryString(num);	// 10진수 -> 2진수
		String a8 = Integer.toOctalString(num);		// 10진수 -> 8진수 
		String a16 = Integer.toHexString(num);		// 10진수 -> 16진수
		
		System.out.println("10진수 77을 2진수로 변환 : " + a2);
		System.out.println("10진수 77을 8진수로 변환 : " + a8);
		System.out.println("10진수 77을 16진수로 변환 : " + a16);
		
		System.out.format("%X\n", 10);
		
		
		
	}

}
