package _03_ex;
//사용자 정의 예외 클래스는 반드시 Exception 상속받아 사용
public class NumException extends Exception{
	NumException(){ }
	public NumException(String message){ 
		super(message);
	}
}
