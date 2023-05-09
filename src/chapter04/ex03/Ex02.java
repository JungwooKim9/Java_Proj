package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 이중 for문을 사용해서 구구단 출력 (printf( "\t" ), println()
		 
		 1단
		 1 * 1 = 1		1 * 2 = 2		1 * 3 = 3 ....... 1 * 9 = 9
		 
		 2단
		 2 * 1 = 2		2 * 2 = 4		2 * 3 = 6 ....... 2 * 9 = 18
		 
		 ...
		 
		 9단
		 9 * 1 = 9		9 * 2 = 18		9 * 3 = 27 ....... 9 * 9 = 81
		 
		 */
		
		int i,j;
		for(i=1; i<10; i++) {
			
			System.out.println(i + "단");
			
			for(j=1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			
			System.out.println();
			System.out.println();
			
		}
			
		
		
	}
	
}
