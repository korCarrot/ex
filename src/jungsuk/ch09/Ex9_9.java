package jungsuk.ch09;

public class Ex9_9 {

	public static String delChar(String src, String delCh) {
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			if(delCh.indexOf(ch) == -1) {
				buffer.append(ch);
			}
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
		+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		
		System.out.println("(1 2 3 4\t5)"+" -> "
		+ delChar("(1 2 3 4\t5)"," \t"));
		}

	
}
