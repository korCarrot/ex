package jungsuk.ch04;

public class Ex4_2 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=20;i++) {
						
			if(!(i%2==0 || i%3==0)) {
//				System.out.println(i);
				
				sum +=i;
			}
		}
		
		System.out.println(sum);
		
		
		//2또는 3의 배수가 아닌 수의 총합
		
		//num%2==0
		//num%3==0
	}
}
