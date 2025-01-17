package _04_set;

import java.util.HashSet;
import java.util.Set;

// equals()를 오버라이딩 했을 떄 hashCode()를 반드시 오버라이딩 해야 됨
class Member{
	String name;
	int age;


	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) && m.age == age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
		
		
	}
	
}
public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		
		System.out.println("총 객체 수 : " + set.size());
		
		
		System.out.println();
	}

}
