package jungsuk.ch12;

public class Product {

	String product;
	
	public Product() {
	
	}
	
	public Product(String product) {
		this.product=product;
	}
	
	@Override
	public String toString() {
	
		return this.product;
	}
}
