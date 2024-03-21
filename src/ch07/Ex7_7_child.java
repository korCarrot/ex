package ch07;

public class Ex7_7_child extends Ex7_7{

	public String name;
	
	public Ex7_7_child() {
	this("홍길동");
		System.out.println("child() call");
	}
	
	public Ex7_7_child(String name) {
		this.name=name;
			System.out.println("child(String name) call");
		}
	
	
	
	
}
