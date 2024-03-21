package jungsuk.ch09;

import java.util.Scanner;

public class Ex9_11 {

	public static void main(String[] args) {
		int from = 0;
		int to = 0;
		
		try {
		if(args.length!=2) {			
			
			throw new Exception(" 시작 단과 끝 단 , 두 개의 정수를 입력해주세요.");} 
		
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			
			if(!(2 <= from && from <= 9 && 2 <= to && to <= 9)) {
			throw new Exception(" 단의 범위는 2와 9 사이의 값이어야 합니다.");}  
			
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
			}
		
			//  시작 단 (from) 이 끝 단(to) 보다 작아야하니까
			//  to보다 from의 값이 크면 두 값을 바꾼다.
		
			if(from > to) {
			int tmp = from;
			from = to;
			to = tmp;
			}
			
			// from 단부터 to단까지 출력한다.
			for(int i=from;i<=to;i++) {
			for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
			}

	}
	
}

//스캐너
//
//조건1: 숫자 2개 (안쓰거나, 하나만 쓰거나, 3개 이상 쓰면 안됨)
//조건2: 범위는 2와 9사이
//
//구구단