package _10_ex;

public class BookRun {

	public static void main(String[] args) {
		BookMenu bm = new BookMenu();
		bm.menu();
		
	}
		
}

/*api class : 
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
	      오버라이딩 : 
	        toString()
			    제목 : title, 저자 : author, 출판사 : publisher
			equals()
			    title가 같으면 true반환
			    다르면 false반환 
			hashCode()
				title로 해시코드 만들기
			compareTo(Book book) {
				this.getTile().compareTo(book.getTitle())
			}

	   LibraryController
	      속성 :
			ArrayList<Book> list 객체 생성
	     생성자 :
			list에 책 3권을 명시적으로 넣기
	     메소드 :
			void insertBook(Book book) {
				받은 book을 list에 추가
			}
			ArrayList<Book> selectList() {
				return list;
			}
			ArrayList<Book> searchBook(String keyword) {   
				title에 keyword가 포함되어 있으면 검색
				ArrayList 반환	
			}
			Book deleteBook(String title, String author) {
				title와 author이 맞는 책 삭제
				삭제한 Book반환
			}
			int ascBook() {
				list.sort();
				return 1;
			}

		BookMenu (api) : 각 메뉴에 따른 출력구문 정의

			사용자가 0을 넣을 때까지 반복적으로 물어보기
			*************** 메뉴 *************
			1. 새 도서 추가
			2. 전체 도서 조회
			3. 도서 검색
			4. 도서 삭제
			5. 도서명 오름차순 정렬
			0. 종료
			
	main class : BookRun
	     BookMenu 객체 생성
	     메뉴 호출*/