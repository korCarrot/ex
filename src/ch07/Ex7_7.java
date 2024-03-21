package ch07;

public class Ex7_7 {

	public String nation;
	
	public Ex7_7() {
	this("대한민국");
	System.out.println("Parent() call");
	}
	
	public Ex7_7(String nation) {
		this.nation=nation;
		System.out.println("Parent(String nation) call");
		}
	
	
	
}
