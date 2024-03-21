package jungsuk.ch07;		//로컬변수로 중첩클래스 문제일텐데..

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
	this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
	}
	
	public String toString() {

		return num + ( isKwang ? "K":"");
	}

	class Exercise7_14 {
		public static void main(String args[]) {
		SutdaCard card = new SutdaCard(1, true);
		System.out.println(card.toString());
		SutdaCard card1 = new SutdaCard(2, true);
		System.out.println(card1.toString());
		}}
}