package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 스캐너로 월을 인풋 받습니다. (1 ~ 12월까지 정수를 인풋 받습니다.)
		 월을 인풋 받아서 해당 월의 날짜를 출력하는 프로그램 입니다.
		 
		 " 해당 월은 X월이고, X일까지 존재합니다."
		 
		 참고: 1,3,5,7,8,10,12	<== 31일까지 존재
		 	 2					<== 28일
		 	 30일				<== 그 외
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int month;		// 스캐너로 월을 인풋 받습니다
		int day = 30;	// day 변수에 초기 값을 30으로 할당
		
		System.out.println("==1. case문 내에서 출력===");
		
		System.out.println("1 ~ 12까지의 정수를 입력하세요 >>");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			// day = 31;
			day += 1;		// day = day + 1;
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n\n", month, day);
			break;
		case 2:
			day -= 2;		// day = day -2;
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n\n", month, day);
			break;
		default:
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n\n", month, day);
			break;
		}
		
		
		System.out.println("==1. case문 밖에서 출력===");
		
		
		System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n\n", month, day);
		
		sc.close();
		
	}
	
}
