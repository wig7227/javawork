package _04_document;

public class Document {
	String name;
	static int count;
	
	Document() {
		System.out.println("제목없음" + ++count + ".txt 문서가 생성됨");
		
	}
	
	Document(String name) {
		this.name = name;
		System.out.println(this.name + ".txt 문서가 생성됨");
	}
	
}
