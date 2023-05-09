package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 단축키: Ctrl + Shift + F <== 코드를 자동 정렬
		// 단축키: Ctrl + Alt + 화살표: 선택된 라인을 복사
		// 단축키: Alt + 화살표: 선택 라인 이동

		// 스캐너로 번호를 인풋 받아서 4번을 누를때까지는 계속 무한 루프
		// do while, if, for-for

		Scanner sc = new Scanner(System.in);
		int key; // sc로 받은 값을 담은 변수

		do {

			System.out.println("==============================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("==============================================================");
			System.out.println("위에 번호를 입력하세요 >>");

			key = sc.nextInt();

			if (key == 1) {
				System.out.println("1. 구구단 출력");

				for (int i = 1; i < 10; i++) {		// 단수를 출력하는 for, i: 단
					System.out.println();
					System.out.println(i + "단");

					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\t", i, j, i * j);
					}
					System.out.println();		// 단수를 출력 후 enter
				}

			} else if (key == 2) {
				System.out.println("2. 19단 출력");

				for (int i = 1; i < 20; i++) {
					System.out.println();
					System.out.println(i + "단");

					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (key == 3) {
				System.out.println("3. 19단 중 7배수단 출력");

				for (int i = 7; i < 20; i += 7) {
					System.out.println();
					System.out.println(i + "단");

					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (key == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하였습니다(1 ~ 4 사이의 정수를 입력하세요)");
			}
			System.out.println();

		} while (true);

		System.out.println("프로그램을 종료하였습니다.");

		sc.close();

	}

}
