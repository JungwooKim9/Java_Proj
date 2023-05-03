package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 스캐너 등록
		// 2. 우리 가족의 이름(String) 및 몸무게(double)를 인풋 받고, 몸무게의 합과, 평균을 구해서 출력하는 프로그램을 작성
			// sc.nextDouble();
		Scanner sc = new Scanner(System.in);
		String fotherName;
		String motherName;
		String brotherName;
		String myName;
		double fotherWeight;
		double motherWeight;
		double brotherWeight;
		double myWeight;
		
		System.out.println("아버님의 이름을 입력하세요 >>>");
		fotherName = sc.next();
		System.out.println("아버님의 몸무게를 입력하세요 >>>");
		fotherWeight = sc.nextDouble();
		
		System.out.println("어머님의 이름을 입력하세요 >>>");
		motherName = sc.next();
		System.out.println("어머님의 몸무게를 입력하세요 >>>");
		motherWeight = sc.nextDouble();
		
		System.out.println("형제의 이름을 입력하세요 >>>");
		brotherName = sc.next();
		System.out.println("형제의 몸무게를 입력하세요 >>>");
		brotherWeight = sc.nextDouble();
		
		System.out.println("자신의 이름을 입력하세요 >>>");
		myName = sc.next();
		System.out.println("자신의 몸무게를 입력하세요 >>>");
		myWeight = sc.nextDouble();
		
		double sum = fotherWeight + motherWeight + brotherWeight + myWeight;
		double avg = sum / 4.0;
		
		System.out.printf("아버님의 이름은 %s이고 몸무게는 %5.2f이고, 어머님의 이름은 %s이고 몸무게는 %5.2f이고,\n"
				+ "형제의 이름은 %s이고 몸무게는 %5.2f이고, 자신의 이름은 %s이고 몸무게는 %5.2f입니다.\n",
				fotherName, fotherWeight, motherName, motherWeight, brotherName, brotherWeight,
				myName, myWeight);
		System.out.printf("가족 몸무게의 합은 %5.2f이고, 가족 몸무게의 평균은 %5.2f입니다.", sum, avg);
		
		
	}

}
