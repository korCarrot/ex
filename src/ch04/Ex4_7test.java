package ch04;

import java.util.Scanner;

public class Ex4_7test {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	int balance=0;
	
	boolean flag=true;
	
	while(flag) {
		System.out.println("---------------");
		System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
		System.out.println("---------------");
		
		String inputStr=scanner.nextLine();
		int inputnum=Integer.parseInt(inputStr);
		
		if(inputnum==1) {
			System.out.println("선택>"+inputnum);
		}
		
	}
}
}
