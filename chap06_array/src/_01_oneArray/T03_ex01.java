package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		//1. 총점. 평균 구하기
		int sum = 0;
		int score[] = {100, 98, 49, 78, 86};
		for(int i=0;i<score.length;i++) {
			sum += score[i];
			
		}
		System.out.println("합계 : " + sum);
		double avg = (double)sum / 5;
		System.out.println("평균 : " + avg);


		
		//2. 최대값과 최소값 구하기
		int num[] = {83, 70, 27, 49,20,86,90,83,58,29};
		int max = num[0];
		int min = num[0];
		
		for(int i=1;i<num.length;i++) {
				if(max < num[i]) {
					max = num[i];
				}
				if(min > num[i]) {
					min = num[i];
				}
			}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}