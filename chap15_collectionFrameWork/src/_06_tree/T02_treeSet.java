package _06_tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 넣으세요 : ");
		
		int money = sc.nextInt();
		int ty = money / 1000;
		
		for(int i=0; i<ty;i++) {
			set.clear();
			while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}
			System.out.println(set);
		}
	}
}
