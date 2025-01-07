package _06_ex;

public class Book {
	
	//생성자 4개 오버로딩
	//저자(String)
	//ISBN(int 숫자5개)
	//가격(int)
	
	int ISBN; //숫자5개
	int pr;
	String name;
	
	Book(){
		this("김태형", 33333, 45000);
	}
	
	Book(String name){
		this(name, 12345, 20000);
	}
	
	Book(String name, int ISBN){
		this(name, ISBN, 40000);
	}
	
	Book(String name, int ISBN, int ex){
		this.name = name;
		this.ISBN = ISBN;
		this.pr = ex;
	}
	
}
