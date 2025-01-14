package _03_ex;

public class Add {

	public void Add(int num1,int num2) throws NumException {
	
		int sum = 0;
		
		if(num1 >= 0 && num2 >= 0) {
				sum = num1 + num2;
				System.out.println(num1 + "+" + num2 + "=" + sum);
			
		} else {
			throw new NumException("양수가 아닙니다");
		}
	}
	
	

}
