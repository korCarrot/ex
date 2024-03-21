package jungsuk.ch04;

public class Ex4_11 {

	public static void main(String[] args) {
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
		int num1 = 1; // 첫번째 항
		int num2 = 1; // 두번째 항
		int num3 = 0; // 세번째 항

		System.out.print(num1+","+num2);
		
//		num2 = num1 + num2;
//		num3 = num3 + num2;
		
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			num1=num2;
			num2=num3;
			System.out.printf(",%d",num3);
		}
		
}
}