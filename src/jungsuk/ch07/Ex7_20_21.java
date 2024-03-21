package jungsuk.ch07;

public class Ex7_20_21 {

	/*
	 p는 부모로 자동형변환된 child객체
	 c는 child 객체
	 
	 콘솔에 px=100
	 Parent Method
	 
	 c.x=200
	 Child Method가 찍힌다.
	 
	 */
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		}
		}
		class Parent2 {
		int x = 100;
		void method() {
		System.out.println("Parent Method");
		}
		}
		class Child2 extends Parent2 {
		int x = 200;
		void method() {
		System.out.println("Child Method");
		}
		
		
		//21번 오버라이딩할 move메소드의 매개변수 값. int x, int y에 들어갈 값
		
		
}
