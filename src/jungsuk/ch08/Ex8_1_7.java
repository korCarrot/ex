package jungsuk.ch08;

public class Ex8_1_7 {

	// 코드를 실행하기 전이나 컴파일하면서 오류를 찾아내는 일. 코드의 오류를 찾아 수정하기 위함

	// 2번 a

	// 3번 b, c

	// 4번 b, c

	// 5번 1 2 3 5 6 1 2 4 5 6
	// 정답: 1 3 5 1 2 5 6

	// 6번 5 1 3 4
	// 정답: 3 5 (메소드 안에 catch문에서 해당하는 예외처리로만 갈 수 있음 / 해당하는 예외처리가 없어서 5로)

	// 7번 1 1 2 5
	// 정답: 1 (System.exit은 코드 전체를 중지시킨다.)

//	<6번문제>
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	} // method1()

	static void method2() {
		throw new NullPointerException();	//runtimeException
	}

//	<7번 문제>
//	static void method(boolean b) {
//		try {
//			System.out.println(1);
//			if (b)
//				System.exit(0);
//			System.out.println(2);
//		} catch (RuntimeException r) {
//			System.out.println(3);
//			return;
//		} catch (Exception e) {
//			System.out.println(4);
//			return;
//		} finally {
//			System.out.println(5);
//		}
//		System.out.println(6);
//	}
//
//	public static void main(String[] args) {
//		method(true);
//		method(false);
//	}
}
