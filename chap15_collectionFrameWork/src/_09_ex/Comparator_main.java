package _09_ex;

import java.util.TreeSet;

public class Comparator_main {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new Descending());
		treeSet.add(new Fruit("포도", 7000));
		treeSet.add(new Fruit("딸기", 10000));
		treeSet.add(new Fruit("사과", 5000));
		
		System.out.println(treeSet);
	}
}
/*class : 
    Fruit
		name
		price

		생성자(모든 필드)

    Descending

    Comparator_main
		TreeSet 객체 생성
		add-3개
		출력*/