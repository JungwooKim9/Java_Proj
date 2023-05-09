package chapter04.ex06;

public class Continue_controll_Statement {

	public static void main(String[] args) {
		/*
		 continue: 제어문 내에서 break와 비슷하게 사용되는 키워드 - break(실행문을 탈출), continue(아래 구문을
		 작동시키지 않고 증감식을 실행)
		 */

		// 1. 단일 Loop에서 continue
		System.out.println("=====1. 단일 Loop에서 continue=====");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			continue;
			// System.out.println(i); // 도달할 수 없는 코드이므로 오류 발생: if 조건을 통해 사용하라
		}

		System.out.println("==if조건과 continue를 같이 사용==");
		for (int i = 0; i < 5; i++) {
			System.out.println("continue 작동 전 - " + i);
			if (i == 3)
				continue;
			System.out.println("continue 작동 후 - " + i);
		}

		// 2. 다중(이중) Loop에서 continue	: 한 단계만 continue가 된다.
		System.out.println("=====2. 다중(이중) Loop에서 continue=====");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ( i == 3) continue;
				System.out.println(i + ", " + j);
			}
		}

		// 3. 다중(이중) Loop에서 continue	: LABLE을 사용해서 점프가 작동 됨
		System.out.println("=====3. 다중(이중) Loop에서 continue	: LABLE을 사용해서 점프가 작동 됨=====");
	pos2: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (j == 2) continue pos2;
				System.out.println(i + ", " + j);
			}
		}
		
	}

}