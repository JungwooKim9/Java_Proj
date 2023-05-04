package chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		/*
		 삼항 연산자: if ~ else를 축약해서 한 라인 으로 사용하는 구분,
		 	(조건) ? 참(실행구문) : 거짓(실행구문);
		 */

		int val1 = (3 > 5) ? 6 : 9;		// 조건이 거짓 이므로 변수 val1에 9가 할당
		
		System.out.println(val1);	// 9
		
		int val2 = ( 3 < 5 ) ? 6 : 9 ;	// 조건이 참 이므로 변수 val2에 6이 할당
		System.out.println(val2);	// 6
		
	}

}
