package chapter05.ex06;

import java.util.Arrays;

public class Non_Rectangle_Array {

	public static void main(String[] args) {
		/*
		 2차원 배열:
		 	-정방형 배열: 각 행에 대해서 열의 갯수가 같은 배열
		 	-비 정방형 배열: 각 행에 대해서 열의 갯수가 각각 다른 배열
		 */
		// 1. 비 정방형 배열 선언:
		//		-- 배열 변수를 생성 시에 행의 방 번호만 지정 후, 나중에 각 행에 대해서 열의 방 번호를 지정함
		// -- 행의 방 번호만 지정: 0, 1, 2
		int[][] arr1 = new int[3][];
		arr1[0] = new int[5];			// 0번 행의 열의 갯수 지정: 5
		arr1[1] = new int[2];			// 1번 행의 열의 갯수 2
		arr1[2] = new int[4];			// 2번 행의 열의 갯수 4
		
		// 직접 값을 할당
		// 0 행의 5개의 방에 값 할당
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		arr1[0][4] = 50;
		
		// 1 행의 2개의 방에 값 할당
		arr1[1][0] = 11;
		arr1[1][1] = 12;
		
		// 2 행의 4개의 방에 값 할당
		arr1[2][0] = 21;
		arr1[2][1] = 22;
		arr1[2][2] = 23;
		arr1[2][3] = 24;
		
		// arrays.toString();
		System.out.println("===Arrays.toString()===");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("==================================");
		int[][] arr2 = new int [3][];			// 비 정방형 배열 선언
			arr2[0] = new int[100];				// 10의 배수 입력
			arr2[1] = new int[200];				// 20의 배수 입력
			arr2[2] = new int[150];				// 30의 배수 입력
		
		System.out.println(arr2.length);		// 행의 갯수 출력 // 3
		System.out.println(arr2[0].length);		// 0 행의 length 출력 // 100
		System.out.println(arr2[1].length);		// 0 행의 length 출력 // 200
		System.out.println(arr2[2].length);		// 0 행의 length 출력 // 150
		
		// 이중 for문을 사용해서 값을 저장함
		for (int i=0; i<arr2.length; i++) {
			if (i == 0) {
				for (int j=0,a=10; j<arr2[i].length; j++,a+=10) {	// 100번 루프
					arr2[i][j] = a;
				}
				
			}else if (i == 1) {
				for (int j=0,a=20; j<arr2[i].length; j++,a+=20) {	// 200번 루프
					arr2[i][j] = a;
				}
				
			}else if (i == 2) {
				for (int j=0,a=30; j<arr2[i].length; j++,a+=30) {	// 150번 루프
					arr2[i][j] = a;
				}
				
			}
			
		}
			
		System.out.println("===1. For문을 사용해서 출력===");
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===1. Enhanced For문을 사용해서 출력===");
		for (int[] k : arr2) {
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		System.out.println("===3. Arrays.toString을 사용해서 출력===");
		for (int i = 0; i<arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		
	}

}
