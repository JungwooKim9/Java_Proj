package chapter04.ex03;

public class Ex04_1 {

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
		
		
		System.out.println("=====2. 1단 ~ 19단까지 출력 내용 중 3의 배수단만 출력: if문 사용=====");
		
		for (int i=1; i<20; i++) {
			if (i%3 == 0) {
			System.out.println(i + "단");
				for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
		System.out.println("=====2. 1단 ~ 19단까지 출력 내용 중 3의 배수단만 출력: i의 증가값 사용=====");
		
		for (int i=3; i<20; i+=3) {			// 단을 출력하는 for: i <== 단을 출력 변수
			System.out.println(i + "단");
			for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		System.out.println("=====2. 1단 ~ 19단까지 출력 내용 중 3의 배수단만 출력: continue=====");
		
		// 제어 키워드: break; continue;
			// 제어 키워드는 일반적으로 if문과 같이 사용됨
			// break; <== { } 실행 블락을 탈출
			// continue; <== continue를 만나면 continue; 아래 내용은 실행되지 않고, 증감식을 작동 시킴
		
		for (int i=1; i<20; i++) {
			
			if ( i%3 != 0 ) { continue; }			// 3의 배수가 아닐 때는 continue가 작동
			
			System.out.println(i + "단");
			
			for (int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
	}
	
}