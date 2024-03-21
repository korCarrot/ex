package jungsuk.ch04;

public class Ex4_67 {
public static void main(String[] args) {
	
	//6번
//	int num1=(int)(Math.random()*6) +1;
//	int num2=(int)(Math.random()*6) +1;
	
	for(int i=1;i<=6;i++) {
		for(int j=1; j<=6;j++) {
			if(i+j == 6) {
				System.out.printf("(%d,&d)", i, j);
			}
		}
		System.out.println();
	}
	
	//7번
	//0<= 어떤 값 <1
//	System.out.println(Math.random());
//	
//	System.out.println((int)(Math.random()*10) +1);
//	
//	for (int i = 0; i <=100 ; i++) {
//		System.out.println((int)(Math.random()*6) +1);
//	}

	
}
}
