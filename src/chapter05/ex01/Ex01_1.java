package chapter05.ex01;

public class Ex01_1 {

	public static void main(String[] args) {
		/*
		 배열 방 100개를 생성 후 3의 배수만 저장 후 출력
		 힌트: i: 방번호, a: 3의 배수를 저장하는 변수
		 */
		
		// 1. 배열 변수 선언 및 방 크기 지정
		int[] arr1 = new int[100];			// index 0 ~ 99
		System.out.println(arr1.length);	// 방의 갯수를 출력
		
		int a = 0;		// 3의 배수를 저장하는 변수
		
		// arr1 배열의 각 방에 값을 저장하는 for문
		for (int i = 0; i < arr1.length; i++) {
			a += 3;				// a = a + 3;
			arr1[i] += a;;
		}
		
		// arr1 배열의 각 방에 값을  출력하는 for
		System.out.println("==========for문을 사용해서 출력==========");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "]의 값 :" + arr1[i]);
		}
		
		System.out.println("==========Enhanced For: 향상된 For==========");
		// 배열의 첫번째 방부터 마지막 방까지 자동으로 그 값을 출력할 때 사용
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.print("\n\n");
		

		
	}

}
