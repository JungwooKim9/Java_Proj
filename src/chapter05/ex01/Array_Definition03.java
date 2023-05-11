package chapter05.ex01;

public class Array_Definition03 {

	public static void main(String[] args) {
		/*
		 1차원 배열 선언 방법 3가지
		 */

		System.out.println("1. 방법 1");
		int[] arr1;			// 배열 변수 선언
		arr1 = new int[3];	// 배열 방을 생성 [3개]
		
		int[] arr2 = new int[3];	// 선언과 동시에 배열방 생성
		
		int arr3[] = new int[3];	// 위와 동일
		
		int arr4[];
		arr4 = new int[3];
		
		arr4[0] = 10;
		
		System.out.println("2. 방법 2");
		// 배열을 선언과 동시에 값을 할당
		// 주의: 방 크기를 지정하면 안 됨
		int[] arr5 = new int[] {10,20,30};	// 배열 선언과 동시에 값을 바로 할당 시킴
		
		int[] arr6;		// 선언 후
		arr6 = new int[] {10,20,30};
		
		
		System.out.println("3. 방법 3");
		// 선언과 동시에 값을 바로 할당
		int[] arr7 = {10,20,30};
		
		// 오류 발생: 값을 바로 할당하지 않으면 new int[]를 생략할 수 없다.
		int[] arr8;
	//	arr8 = {10,20,30};
		
	}

}
