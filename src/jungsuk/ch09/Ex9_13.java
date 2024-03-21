package jungsuk.ch09;

public class Ex9_13 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaaBBaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") +"개 찾았습니다.");
	}

	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = pos;
		
		if (key == null || key.length() == 0 || src == null || src.length() == 0) {
		return 0;}
		
		System.out.println("while전 : " + index);
		while((index = src.indexOf(key, index)) != -1) {		
//			if(src.contains(key)) {
//				count++;
//			} 무한루프
			
			System.out.println("while후 : " + index);
			count++;
			
//			System.out.println("key길이"+key.length());
			index += key.length();
//			index=src.indexOf(key, index); 무한루프
			System.out.println(index);
		}
		
		return count;
	}

}
