package chapter04.ex03;

public class For_Statement03 {

	public static void main(String[] args) {
		/*
		 이중 for문을 사용해서 구구단 출력
		 	-- for 블락 내에 for가 들어가 있는 구문
		 */
		
		int i, j;		// i: 단을 출력하는 변수, j: 1 ~ 9번까지 출력되는 변수
		
		for(i=1; i<10; i++) {		// 단을 출력하는 블락
			
			System.out.println(i + " 단 출력");
			System.out.println("=====================");
			
			for(j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
	
}
