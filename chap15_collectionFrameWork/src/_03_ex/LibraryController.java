/*package _03_ex;

import java.util.ArrayList;

public class LibraryController {
	Member member;
	ArrayList<Book> aList = new ArrayList<>();


	Book book = new Book();
	
	public LibraryController(Member member) {
		this.member = member;
	}
	
	void info() {
		System.out.println(member);
	}
	void insertBook() {
		aList.add(new Book("java","김자바","ㅇㅇ"));
		aList.add(new Book("oracle","김라클","ㅂㅂ"));
		aList.add(new Book("react","김리액","ㄱㄱ"));
	}

	void insertBook(Book book) {
		aList.add(book);
	}
	
	ArrayList<Book> selectAll(){	//ArrayList 타입을 맞춰줘야함
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다");
			return book;
		}
		for(int i=0;i<aList.size();i++) {
			 if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			 }
		}
		return book;
	}

}*/


package _03_ex;

import java.util.ArrayList;
import java.util.List;

public class LibraryController {
	Member member;
	List<Book> aList = new ArrayList<>();
	
	public LibraryController(Member member) {
		this.member = member;
	}
	
	void info(){
		System.out.println(member);
	}
	
	void insertBook() {
		aList.add(new Book("java", "나자바", "한빛미디어"));
		aList.add(new Book("oracle", "오로라", "길벗"));
		aList.add(new Book("aws", "이고잉", "더조은"));
	}
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
	List<Book> selectAll() {
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return book;
		}
		for(int i=0; i<aList.size(); i++) {
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			}
		}
		return book;
	}
}

