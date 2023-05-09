package chapter04.ex05;

public class Do_While_Statement {

	public static void main(String[] args) {
		/*
		 do while문: 조건과 상관 없이 첫 1회는 무조건 실행 블락을 실행 시킴. 조건을 확인 후 반복
		 
		1. while문: 실행 블락은 조건이 true일때만 실행 시킴
			초기값
			while (조건) {
		 	// 실행 블락
		 	// 증감식
		 	}
		 	
		2. do while문
			초기값
			do {
				// 실행 블락
				// 증감식
			} while (조건);
		 */

		// 1. while문
		System.out.println("===while문===");
		int a = 0;
		while (a < 0) {					// false이므로 실행 블락이 실행되지 않는다.
			System.out.print(a + " ");
		}
		
		// 2. do while문
		System.out.println("===do while문===");
		do {
			System.out.println(a + " ");
		} while (a < 0);				// 조건과 상관 없이 1번은 실행 블락이 작동됨
		
		// 3. 반복 횟수가 10번인 경우: while문과 do while문 비교
		System.out.println("===3. 반복 횟수가 10번인 경우: while문과 do while문 비교===");
		
		System.out.println("== while ==");
		a = 0;		// 변수의 값을 변경
		while (a < 10) {					// 0 ~ 9까지 10번 출력
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		System.out.println("== do while ==");
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);
		
		
	}

}
