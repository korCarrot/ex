package jungsuk.ch09;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
//		path+="c:\\jdk1.8\\work\r\n";
//		fileName+="PathSeparateTest.java";
		
		int num = fullPath.lastIndexOf("\\");
		path+=fullPath.substring(0, num);
		fileName+=fullPath.substring(num+1);
		
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
}
}
