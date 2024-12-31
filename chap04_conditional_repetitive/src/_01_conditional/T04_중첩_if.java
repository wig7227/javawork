package _01_conditional;

public class T04_중첩_if {

	public static void main(String[] args) {
		/*
		  중첩if문
		  if(바깥 조건식) {	// 바깥 조건식이 참일 때  실행할 구문
		  	 if(안의 조건식) {
		  	 	 안의 조건식이 참일 때 실행할 구문
		     } else {
		         안의 조건식이 거짓일 때 실행할 구문
		         
		  	 }
		  	  
		  } else {	// 바깥 조건식에 대한 else
		  	  if(다른 조건식) {
		  	  
		  	   } else {
		  	      다른 조건식이 거짓일 떄 실행할 구문
		      }
	  	  }
	
		 */

		int num1 = 155;
		if(num1 > 100) {	// 100보다 큰 모든 수
			if(num1 > 200) {	//200보다 큰 모든 수
				System.out.println("200보다 큰 숫자");
			} else {	//100보다는 크고 200보다 작은 수
				System.out.println("100보다 크고 200보다 작은수");
			}
		} else {	// 100보다 작은 모든 수
			if(num1 > 0) {	//100~1
				System.out.println("양수");
				if(num1 % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else if(num1 == 0) {
				System.out.println("0");
			} else {
				System.out.println("음수");
			}
		}
	}	
	

}
