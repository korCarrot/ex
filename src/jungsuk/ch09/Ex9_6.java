package jungsuk.ch09;

import java.util.Arrays;

public class Ex9_6 {

	public static String fillZero(String src, int length) {
		if(src==null || src.length()==length) {
			return src;
			
		}else if(length<=0) {
			return "";
			
		}else if(src.length()>length) {
			String result = src.substring(0, length);
			return result;
		}
		
		//src.length < length
		char arr[]=new char[length];
		Arrays.fill(arr, '0');
//		for(int i=0;i<length;i++) {
//			arr[i]=0;
//		}
		 char[] charArray = src.toCharArray();
		System.arraycopy(charArray, 0, arr, 0, charArray.length);
		 
		return new String(arr);
		
//		String arrayAsString = Arrays.toString(arr); 
//		return arrayAsString;
	}
	
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		}

}
