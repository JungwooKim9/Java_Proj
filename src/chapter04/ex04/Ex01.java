package chapter04.ex04;

public class Ex01 {
	
	public static void main(String[] args) {
		/*
		 	1000부터 1까지 5씩 감소하면서 출력: for, while문으로 출력
		 */
		
		System.out.println("===for문으로 출력===");
		
		for (int a=1000; a>0; a-=5) {
			System.out.print(a + "\t");
		}
		
		System.out.print("\n \n");
		
		System.out.println("===while문으로 출력===");
		
		int b = 1000;			// 초기값: while문 밖에서 선언
		while (b > 0) {			// 조건
			System.out.print(b + "\t");		//조건이 true일동안 실행
			b -= 5;				// 증감식
		}
		
		
	}

}
