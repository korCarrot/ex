package jungsuk.ch04;

public class Ex4_3 {
	
	public static void main(String[] args) {

		int tot1=0;
		int tot2=0;
		for(int i=1;i<=10;i++) {
			tot1=tot1+i;
			tot2=tot2+tot1;
		}
		System.out.println(tot2);
		
//		int sum=0;
//		for(int i=1;i<10;i++) {
//			for (int j = 1; j < i; j++) {
//				sum+=j;
//			}
//		}
//		System.out.println(sum);
	}

}
