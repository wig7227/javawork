package _04_interface2;

public interface Inter {
	// 상수만 사용가능
	public static final double PI = 3.14;
	int MAX = 100;
	
	// 추상메서드만 사용가능
	public abstract void print(int a); 
	public abstract void inMethod();
	String inStr(String name); //void 대신 String은 반환형
	
}
