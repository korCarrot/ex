package jungsuk.ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		
		int tot=0;
		
		int sign=-1;
		
	for (int i = 1; i <= 4; i++) {
//		tot+=i;
		
		if(i%2==0) {
			tot = (tot+i) * (sign);	
		}else {
			tot = tot+i;
		}
		
		
		
		
//		if(tot>100) {
//			System.out.println(i);
//			break;
//		}
	}
	System.out.println(tot);
		
//	int tot1=1;
//	int tot2=-2;
//	
//	while() {
//		
//	}  내 방식 시도해보기 /while로 들어가는게 맞다고 하셨음.
	
	}
}
