package jungsuk.ch07;

public class Ex7_19 {

	public static void main(String[] args) {
		
		
	}
}

class Buyer {
int money = 1000;
Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
int i = 0;

void buy(Product p) {
if(money < p.price) {
	return;
}
	money=money-p.price;
	cart[i] = p;
	i++;
}


void add(Product p) {

	if(cart[i]==null) {
		cart = new Product[i*2];
		cart[i]=p;
		i++;	
	}else {
		cart[i]=p;
		i++;
	}
	
}

void summary() {
	
	int num = (1000-money);
	System.out.println("사용 금액: " + num);
	System.out.println("남은 금액: " + money);
}
}

class Product {
int price; // 제품의 가격
Product(int price) {
this.price = price;
}
}

class Tv extends Product {
Tv() { super(100); }
public String toString() { return "Tv"; }
}

class Computer extends Product {
Computer() { super(200); }
public String toString() { return "Computer";}
}

class Audio extends Product {
Audio() { super(50); }
public String toString() { return "Audio"; }
}