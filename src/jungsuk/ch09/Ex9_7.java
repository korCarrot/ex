package jungsuk.ch09;

public class Ex9_7 {

	static boolean contains(String src, String target) {
		if(src.indexOf(target)!=-1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
//		String src="12345";
//		String target="15";
//		System.out.println(src.indexOf(target));	
	}

		
}
