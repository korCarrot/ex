//package jungsuk.ch07;
//
//class Product {
//	int price; // 제품의 가격
//	int bonusPoint; // 제품구매 시 제공하는 보너스점수
//
//	Product(int price) {
//		this.price = price;
//		bonusPoint = (int) (price / 10.0);
//	}
//}
//
//class Tv extends Product {
//	Tv() {
//		super(4);
//	}
//
//	public String toString() {
//		return "Tv";
//	}
//}
//
//public class Ex7_5_6 {
//
//	public static void main(String[] args) {
//		Tv t = new Tv();
//		System.out.println(t.price);
//		System.out.println(t.bonusPoint);
//	}
//
//}
//
//
////부모 클래스의 생성자가 매개변수를 받음.
////하지만 자식 클래스의 생성자가 super()에 매개변수를 넣지 않으면 오류
//
////7-6
////정답 조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
////해설 자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 인스턴스변수들도 생성
////되는데 이 상속받은 인스턴스변수들 역시 적절히 초기되어야 한다. 상속받은 조상의 인
////스턴스변수들을 자손의 생성자에서 직접 초기화하기보다는 조상의 생성자를 호출함으로써
////초기화되도록 하는 것이 바람직하다.
////각 클래스의 생성자는 해당 클래스에 선언된 인스턴스변수의 초기화만을 담당하고 조상
////클래스로부터 상속받은 인스턴스변수의 초기화는 조상클래스의 생성자가 처리하도록 해야
////하는 것이다.