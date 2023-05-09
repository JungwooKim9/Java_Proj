package chapter04.ex03;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 1. 이중 for문을 사용해서 1단 19단까지 출력
		 2. 이중 for문을 사용해서 1단 19단까지 출력 중 3의 배수단만 출력
		 */
		
		System.out.println("=====1. 1단 ~ 19단까지 출력=====");
		
		for (int i=1; i<20; i++) {			// 단을 출력하는 for: i <== 단을 출력 변수
			System.out.println(i + "단");
			for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		
		
		System.out.println("=====2. 1단 ~ 19단까지 출력 내용 중 3의 배수단만 출력=====");
		
		for (int i=1; i<20; i++) {
			if (i%3 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
	}
	
}
