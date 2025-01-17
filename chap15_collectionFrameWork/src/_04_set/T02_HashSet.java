package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A{
	String aa;
	A(String aa){
		this.aa = aa;
	}
}
public class T02_HashSet {

	public static void main(String[] args) {
		T02_HashSet t02 = new T02_HashSet();
		
		Set<A> set1 = new HashSet<>();
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1);
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size : " + set1.size());
		
		Iterator<A> iter = set1.iterator();
		iterPrint(iter); //계속 사용할거라서 아래 메소드로 정의
		/*while(iter.hasNext()) {
			A str = iter.next();
			System.out.print(str.aa + " ");
		}*/
		System.out.println("\n------------------------");
		
		set1.remove(a1);
		iter = set1.iterator();
		iterPrint(iter);
		System.out.println("\n------------------------");
		
		// 삭제 불가 : 주소를 알 수 없음
		set1.remove(new A("b"));	// 새로운 b 객체를 생성하는거라 remove 안됨
		iter = set1.iterator();
		while(iter.hasNext()) {
			A str = iter.next();
			System.out.print(str.aa + " ");
		}
		System.out.println("\n------------------------");
		
		iter = set1.iterator();
		while(iter.hasNext()) {
			A str = iter.next();
			//String strA = str.aa;
			
			if(str.aa.equals("e"))
				iter.remove();
		}
		System.out.print("\ne 삭제 후 : ");
		iter = set1.iterator();
		iterPrint(iter);
		
	}	// main() 메소드 끝

	// iterator의 값 출력하는 메소드
	static void iterPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A str = i.next();
			System.out.print(str.aa + " ");
		}
		System.out.println();
	}
	
}	// class 끝
