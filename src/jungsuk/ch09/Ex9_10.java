package jungsuk.ch09;

import java.util.Arrays;

public class Ex9_10 {

	public static String format(String str, int length, int alignment) {
		if(str.length()>=length) {
			return str.substring(0, length);}
		
			char source[] = str.toCharArray();
//			System.out.println(source);
			
			char arr[]=new char[length];
			Arrays.fill(arr, ' ');
//			System.out.println("arr: " + arr[1]);
		
			int diff =length - str.length();
//			System.out.println(diff);
	
		switch(alignment) {
		case 0 : 
			default :
			System.arraycopy(source, 0, arr, 0, source.length);
			break;
			
		case 1 : 
			System.arraycopy(source, 0, arr, diff/2, source.length);
			break;
			
		case 2 : 
			System.arraycopy(source, 0, arr, diff, source.length);
			break;
		
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String str = "가나다"; 
		
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
		}
}

//2. 1 , length char . 의 경우가 아니면 크기의 배열을 생성하고 공백으로 채운다
//3. (alignment) (str) . 정렬조건 의 값에 따라 문자열 을 복사할 위치를 결정한다
//(System.arraycopy() ) 사용
//4. 2 char . 에서 생성한 배열을 문자열로 만들어서 반환한다