package jungsuk.ch09;

public class Ex9_8 {

	public static double round(double d, int n) {
		double exponent = Math.pow(10, n);
		return Math.round(d*exponent) / exponent;
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		}

}
