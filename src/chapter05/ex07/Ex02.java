package chapter05.ex07;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 main 메소드의 배열 변수 args로 실수 값 넣어서 계산하기
		 args: 합계 10.2  20.5  30.5  40.5  77.7  88.123  99.345  65.123
		 	for문을 사용해서 처리
		 	합계: <실수를 더한 합계>
		 */

		double sum = 0;
		
		for (int m=1; m<args.length; m++) {
			sum += Double.parseDouble(args[m]);
			}
		System.out.println("실수를 더한 합계는 " + sum + "입니다.");
		
	}

}
