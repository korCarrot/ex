package jungsuk.ch12;

public class Juicer {

	public Juicer() {
	
	}
	
	static <T> String makeJuice(FruitBox<T> box) {
		String tmp = "";

		for(Fruit f : box.getList()) {
			tmp += f + "";
		}
		
		return tmp;
	}
	
}
