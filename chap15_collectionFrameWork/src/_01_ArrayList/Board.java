package _01_ArrayList;

public class Board {
	private String subject;
	private String writter;
	private String content;
	
	// 생성자 2개
	// 빈생성자
	// 모든 필드가 있는 생성자
	
	// 각 필드의 setter/getter메서드
	
	// toString 오버라이딩
	// 제목 : ???, 글쓴이 : ???, 가격 : ???
	
	Board(){
		
	}
	
	Board(String subject, String writter, String content){
		
	}
	
	String getSub(){
		return subject;
	}
	
	String getWritter() {
		return writter;
	}
	
	String getPrice() {
		return content;
	}
	
	public void setSub(String subject) {
		this.subject = subject;
	}
	
	public void setWritter(String writter) {
		this.writter = writter;
	}
	
	public void setPrice(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "제목 : " + subject + "글쓴이 : " + writter + "가격" + content;
	}

}
