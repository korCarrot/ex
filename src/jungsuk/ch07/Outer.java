package jungsuk.ch07;

public class Outer {

	int value=10;
	
	class Inner {
		int value=20;
		Outer out = new Outer();
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(out.value);
		}
//25번		int iv=100;
		}
	
//26번	static class Inner2 {	
//		int iv2=200;
//	}
	
}
