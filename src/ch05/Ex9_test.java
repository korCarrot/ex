package ch05;

import java.util.Scanner;

public class Ex9_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			int stuNum = 0; 						// 학생수
			int scores[] = new int[stuNum]; 		// 과목 점수 배열
			int totalScore = 0; 					// 과목 총 점수
			int highScore = Integer.MIN_VALUE; 		// 최고 점수
			double avg = 0; 						// 평균 점수

			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			int number = scanner.nextInt();
			if (number == 1) {
				System.out.print("학생수> ");
				int member = scanner.nextInt();
				stuNum = member;
//				System.out.println(stuNum);				//stuNum의 수 확인
//				System.out.println(scores.length);		//scores[]의 길이 확인
			} else if (number == 2) {
//				System.out.println(scores.length);		//*문제점: if의 stuNum 값이 사라짐
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (number == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (number == 4) {
				for (int i = 0; i < scores.length; i++) {
					if (highScore > scores[i]) {
						highScore += scores[i];
					}
				}
				System.out.println("최고 점수: " + highScore);

				for (int i = 0; i < scores.length; i++) {
					totalScore += scores[i];
					avg = (double) totalScore / scores.length;
					System.out.println("평균 점수: " + avg);
				}
			} else if (number == 5) {
				System.out.println("프로그램 종료");
				flag = false;
			} else {
				System.out.println("1, 2, 3, 4, 5번 중 하나를 입력해주세요.");
			}
		}

	}
}
