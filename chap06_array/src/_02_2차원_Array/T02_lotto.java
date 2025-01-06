package _02_2차원_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_lotto {

	public static void main(String[] args) {
		/*
		// for문을 이용하여 45개 1차원 배열에 값을 1~45까지 넣는다
		// 무작위로 자리바꿈을 해준다
		// 맨앞에서부터 6개만 출력
		
		// 1. 1차원 45개짜리 배열 만들기
		int lotto[] = new int[45]; // 0~44
		
		// 2. 앞에 1~45까지의 값 넣어주기
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		// 3. index번호를 무작위로 뽑아서 자리바꿈을 해준다(random 0~44)
		
		int index = 0;
		for(int i=0; i<100; i++) {
			index = (int)(Math.random()*45);
			int tmp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = tmp;
		}
		
		for(int i=0; i<6; i++){
			System.out.println(lotto[i] + ",");
		}
		*/
		//사용자로부터 정수값 5개 배열에 입력
		//오름차순 정렬로 정렬하기
		/*
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 5개 입력: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			for(int j=0;j<arr.length;j++) {
				int high = arr[0];
				if(high > arr[i]) {
					
				}
				
			}
			System.out.println(arr[i]);	
		}
		*/
		
		/*
 1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
   이용하여 순서대로 넣고 출력하기
*/
		/*
		int arr_1[] = new int[10];

		for(int i=0;i<arr_1.length;i++) {
			arr_1[i] = i+1;
			System.out.print(arr_1[i] + ",");
		}
		*/
		
		
		/*
2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
   이용하여 역순으로 배열 인덱스에 넣고 값 출력
	*/
		/*
		int arr_2[] = new int[10];
		for(int i=0;i<arr_2.length;i++) {
			arr_2[i] = 10 - i;
			System.out.print(arr_2[i]+ ",");
		}
		*/
		
		
		
		/*
3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
   1~입력받은 수를 차례대로 넣어 출력
	*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 할 정수 갯수 입력 : ");
		int num = sc.nextInt();
		int arr_3[] = new int [num];
		System.out.println("출력 할 정수 입력 : ");
		for(int i=0;i<arr_3.length;i++) {
			arr_3[i] = sc.nextInt();
			
		}
		for(int i=0;i<arr_3.length;i++) {
			System.out.print(arr_3[i] + ",");
		}
		//사용자로 부터 입력받은 수 만큼 배열을 만들고  각 배열마다 정수를 입력받아 출력하기
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 할 정수 갯수 입력 : ");
		int num = sc.nextInt();
		int arr_3[] = new int [num];
		for(int i = 0;i<arr_3.length;i++) {
			arr_3[i] = i + 1;
			System.out.println(arr_3[i]);
		}
		 */

		
		
		
		
		/*
4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
   배열 인덱스를 이용하여 귤 출력
		*/
		/*
		String arr_4[] = new String [5];
		arr_4[0] = "사과";
		arr_4[1] = "귤";
		arr_4[2] = "포도";
		arr_4[3] = "복숭아";
		arr_4[4] = "참외";
		
		System.out.println(arr_4[1]);
		*/
		

		/*
5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
   ex)
   문자열 : application
   문자 : i
   application에 i가 존재하는 위치(인덱스) : 4 8 
   i 개수 : 2
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		System.out.println("찾을 문자열 입력 : ");
		char ch = sc.next().charAt(0);
		
		char[] chRe = new char[str.length()];
		int count = 0;
		String index = "";
		for(int i =0;i<str.length();i++) {
			chRe[i] = str.charAt(i);
			if(chRe[i] == ch) {
				count++;
				index += i + " ";
			}
		}
		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + "개수 : " + count);
		*/
		
		
		
		/*
6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
   숫자와 같은 요일 출력
   ex.
   0 ~ 6 사이 숫자 입력 : 4			
   금요일
   0 ~ 6 사이 숫자 입력 : 7
   잘못 입력하셨습니다.
		*/
		/*
		Scanner sc = new Scanner(System.in);
		String day[] = new String [7];
		day[0] = "월";
		day[1] = "화";
		day[2] = "수";
		day[3] = "목";
		day[4] = "금";
		day[5] = "토";
		day[6] = "일";
		
		System.out.println("0~6사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
	
		if(num >6) {
			System.out.println("잘못 입력하셨습니다");
		}
		else {
			System.out.println(day[num]);
		}
		*/
		
		
		
		
		/*
7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
   배열 전체의 합 출력
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		int sum = 0;
		int arr_7[] = new int[size];
		System.out.println(size + "개의 숫자를 입력하세요 : ");
		for(int i=0;i<size;i++) {
			System.out.println((i + 1) + "번째 숫자 : ");
			arr_7[i] = sc.nextInt();
			sum += arr_7[i];
		}
		System.out.println("배열의 합 : " + sum);
		*/
		

		
		
		/*
8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
   다시 정수를 받도록 하세요. 

   ex.
   정수 : 4
   다시 입력하세요.
   정수 : -6
   다시 입력하세요.
   정수 : 5
   1, 2, 3, 2, 1
		*/
		/*
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3이상인 홀수 자연수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 3 || num % 2 == 0) {
			System.out.println("정수 : " + num);
			System.out.println("다시 입력하세요 : ");
		}
		else {
			int arr_8[] = new int [num];
			int middle = num /2;
			System.out.println("정수 : " + num);
			for(int i=0;i<=middle;i++) {
				arr_8[i] += i + 1;
			}
			for(int i=middle+1; i <num;i++) {
				arr_8[i] = num - i;
			}
			for(int i =0; i< num; i++) {
				
			System.out.print(arr_8[i]+ ", ");
		}
		break;
		}
	}
		//, ?
		*/
		
		
		
		
		
		
		
		
		/*
9. 사용자가 입력한 값이 배열에 있는지 검색하여
   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
   ex.
   치킨 이름을 입력하세요 : 양념			
   양념치킨 배달 가능

   치킨 이름을 입력하세요 : 불닭
   불닭치킨은 없는 메뉴입니다.
		*/
		/*
		String chicken[] = {"후라이드","양념","파닭","간장","마늘"};
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요 : ");
		String order = sc.next();
		boolean found = false;
		
		for(String str : chicken) {
			if(str.equals(order)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(order + "치킨 배달 가능");
		}
		else {
			System.out.println(order + "치킨은 없는 메뉴입니다");
		}
		*/
		/*
		String chicken[] = {"후라이드","양념","파닭","간장","마늘"};
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요 : ");
		String order = sc.next();
		boolean found = false;
		
		for(int i=0;i<chicken.length;i++) {
			if(order.equals(chicken[i])) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(order + "치킨 배달 가능");
		}
		else {
			System.out.println(order + "치킨은 없는 메뉴입니다");
		}
		*/
		
		
		
		/*
10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
     1~10 사이의 난수를 발생시켜 배열에 초기화 후
     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
     ex.
     5 3 2 7 4 8 6 10 9 10 
     최대값 : 10
     최소값 : 2
		*/
		/*
		int arr_10[] = new int[10];
		for(int i=0;i<arr_10.length;i++) {
		arr_10[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr_10[i] + " ");
		}
		int max = arr_10[0];
		int min = arr_10[0];
		
		for(int i=0;i<arr_10.length;i++) {
			if(arr_10[i] > max) {
				 max = arr_10[i];
			}
			if(arr_10[i] < min) {
				 min = arr_10[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		*/
		
		
		
		/*
11. 사용자로부터 정수값 5개 배열에 입력
   오름차순 정렬로 정렬하기
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 5개 입력: ");
		int num = sc.nextInt();
		int arr[] = new int [num];
		for(int i=0;i<arr.length-1;i++) {
			boolean flag = false;
			arr[i] = sc.nextInt();
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[i+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));	
		*/
		
		/*
12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
   점수는 2차원 배열로 마음대로 넣는다.
ex)
  번호  국어  영어  수학  총점  평균
-----------------------------------------
   1     95    100     78   273  83.3
   2     68     57    100   273  83.3
   3     62     97     85    273  83.3
   4     85     83     69    273  83.3
   5     86     74     38    273  83.3
------------------------------------------
총점   479   500   387 
평균  95.0  100.0  78.3
		 */
		
		int[][] scores = {{95, 100, 78},
				          {68, 57, 100},
				          {62, 97, 85},
				          {85, 83, 69},
				          {86, 74, 38}};
		int scSum[] = new int[3];
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for(int i=0;i<scores.length;i++) {
			System.out.print(" " + (i + 1) + "\t");
			int sum = 0;
			
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
				scSum[j] += scores[i][j];
			}
			
			double avg = (double)sum / 3;
			System.out.printf("%d\t%.1f\n", sum,avg);
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.print("총점 ");
	       for(int sum : scSum) {
	           System.out.print(sum + "  ");
	       }
	       System.out.println();
	       
	       
	       System.out.print("평균 ");
	       for(int sum : scSum) {
	           System.out.printf("%.1f ", (double)sum / scores.length);
	       }
	       System.out.println();
	       
	}

}
