package ch03;

public class B {
public static void main(String[] args) {
	
	int i=0;
	while(i<=10) {
	int j=0;
	while(j<=i) {	
		System.out.print("*");
		System.out.println();
		j++;
		}
		i++;
	}
}
}