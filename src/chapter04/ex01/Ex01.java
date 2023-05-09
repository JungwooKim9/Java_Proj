package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 money를 인풋 받습니다.
		// 0 ~ 3000: "걸어서 다닙니다"
		// 3001 ~ 30000: "지하철을 타고 다닙니다"
		// 30001 ~ 100000: "택시를 타고 다닙니다"
		// 100001 ~ : "비행기를 타고 다닙니다"
		
		int money;
		// 1. Scanner 등록 (콘솔로 인풋 ==> 변수)
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 자산을 입력하세요 >>");
		
		money = sc.nextInt();		// 콘솔에서 변수 값을 받아 money 변수에 할당
				
		if (0 <= money && money <= 3000) {
			System.out.println("걸어서 다닙니다.");
		} else if (3000 < money && money <= 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		} else if (30000 < money && money <= 100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else {
			System.out.println("비행기를 타고 다닙니다.");
		}

		// CODE REVIEW: 위의 if-else 문을 아래와 같이 수정할 수 있음
		// 1. money가 음수인 경우 처리
		// 2. 각 조건문 내 비교 연산을 2개에서 1개로 축소
		// 3. 조건문 내 좌우 공백 개수를 통일 if ( condition) => if (condition)
		if (money <= 3000) {
			System.out.println("걸어서 다닙니다.");
		} else if (money <= 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		} else if (money <= 100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else {
			System.out.println("비행기를 타고 다닙니다.");
		}

		sc.close();		// 스캐너 종료, 메모리에서 삭제
	}

}
