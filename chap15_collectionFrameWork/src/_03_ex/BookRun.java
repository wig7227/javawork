package _03_ex;

/*public class BookRun {

	public static void main(String[] args) {
		api class : 
		   Book
		      속성 :
				title
				author
				publisher
		      생성자 :
				매개변수가 없는 생성자
				매개변수가 3개인 생성자 {
					인스턴스 변수에 넣기
				}
		      메소드 :
				setter / getter 메소드
		      오버라이딩 : toString()
				제목 : title, 저자 : author, 출판사 : publisher
	
		   Member
		      속성 :
				name
				age
				gender
		     생성자 :
				매개변수가 없는 생성자
				매개변수가 3개인 생성자 {
					인스턴스 변수에 넣기
				}
		      메소드 :
				각 필드의 setter / getter 메소드
		      오버라이딩 : toString()
				이름 : name, 나이 : age, 성별 : gender
	
		   LibraryController
		      속성 :
				member (Member를 객체 생성하여 필드에 저장)
				ArrayList<Book> aList 객체 생성
		     생성자 :
				Member 객체를 매개변수로 받는 생성자 {
					인스턴스변수 member에 넣기 
				}
		     메소드 :
				void info{member의 toString() 출력}
				void insertBook() {
					aList.add(  )
					aList.add(  )
					aList.add(  )
				}
				ArrayList<Book> selectAll() {
					return aList;
				}
				Book searchBook(String bookTitle) {
					Book book = null;
					for() {
	
					}
					return book;
				}
	
		main class : BookRun
		     new LibraryController(new Member("", , "")) 객체 생성
		     책 넣기
		     책 목록 출력
		     책 검색	
		Book book = new Book();

		LibraryController lc = new LibraryController(new Member("홍길동",20 , "남"));
		
		lc.insertBook();
		
		System.out.println(lc.selectAll());
		
		lc.insertBook(new Book("springBoot","김부트","ㄴㄴ"));

		
		System.out.println(lc.searchBook("java"));
	
		Book book1 = lc.searchBook("java");
		if(book1 == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println("찾은 책 : " + book1);
		}*/

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("홍길동", 23, "남자"));
		
		lc.insertBook();
		System.out.println(lc.selectAll());
		
		lc.insertBook(new Book("springBoot", "박봄이", "위키북스"));
		System.out.println(lc.selectAll());

		Book book = lc.searchBook("java");
		if(book == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println("찾은 책 : " + book);
		}
	}
}




