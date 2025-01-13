package _03_ex;

import java.util.Scanner;

import _02_userException.UserException;

public class Add {

	
	public void Add(int num1,int num2) throws UserException {
	
	int sum = 0;
	if(num1 >= 0) {
		if(num2 >=0)
	sum = num1 + num2;
	System.out.println(num1 + "+" + num2 + "=" + sum);
	}
	else
		throw new UserException ("양수가 아닙니다");
	}
	
	

}
