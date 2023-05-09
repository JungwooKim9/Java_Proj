package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		  switch문으로 작성
		 1. Scanner로 정수 1, 2, 3을 인풋 받아서
		 	1: "금메달 입니다."
		 	2: "은메달 입니다."
		 	3: "동메달 입니다."
		 	그 외 정수를 인풋 받으면: "메달이 없습니다."
		 	=========================================
		 2. Scanner로 문자열 "gold", "silver", "bronze"
		 	"gold": "금메달 입니다."
		 	"silver": "은메달 입니다."
		 	"bronze": "동메달 입니다."
		 	그외 정수를 인풋 받으면: "메달이 없습니다."
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값을 입력해주세요 >>");
		int medal1 = sc.nextInt();
		switch (medal1) {
			case 1:
				System.out.println("금메달 입니다.");
				break;
			case 2:
				System.out.println("은메달 입니다.");
				break;
			case 3:
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				//break;
		}
		
		System.out.println("===========================");
		
		System.out.println("메달을 입력해주세요 >>");
		String medal2 = sc.next();
		switch (medal2) {
			case "gold": case "Gold": case "GOLD":
				System.out.println("금메달 입니다.");
				break;
			case "silver": case "Silver": case "SILVER":
				System.out.println("은메달 입니다.");
				break;
			case "bronze": case "Bronze": case "BRONZE":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}

		// CODE REVIEW: (String 변수).toUpperCase() => 해당 문자열을 대문자로 변환
		// 소문자와 대문자가 섞인 경우에도 처리 가능 ex) "gOlD"
		medal2 = medal2.toUpperCase();
		switch (medal2) {
			case "GOLD":
				System.out.println("금메달 입니다.");
				break;
			case "SILVER":
				System.out.println("은메달 입니다.");
				break;
			case "BRONZE":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				// default 블록 내 break는 생략 가능
				// break;
		}
		
		sc.close();
		
	}

}
