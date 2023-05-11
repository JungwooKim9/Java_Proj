package chapter05.ex04;

public class Ex01_1 {

	public static void main(String[] args) {
		/*
		 arr1 = 4행 100열의 2차원 배열 방을 생성하세요.
		 	0행: 10의 배수만 저장
		 	1행: 3의 배수만 저장
		 	2행: 3의 배수를 저장하지만 6의 배수는 저장하지 않음
		 	3행: 7의 배수, 8의 배수 저장
		 	
		 	//for문을 사용해서 출력
		 */
		
		// 1.배열 선언
		int arr1[][] = new int[4][100];
		
		System.out.println("행의 갯수: " + arr1.length);
		System.out.println("0행의 열의 갯수: " + arr1[0].length);
		System.out.println("1행의 열의 갯수: " + arr1[1].length);
		System.out.println("2행의 열의 갯수: " + arr1[2].length);
		System.out.println("3행의 열의 갯수: " + arr1[3].length);
		
		// 2. 배열의 각 방에 값을 지정
		for (int i=0; i<arr1.length; i++) {			// i: 행을 Loop: 0, 1, 2, 3
				if(i == 0) {			//10의 배수 저장
					
					for (int j=0, a=10; j<arr1[i].length; j++) {	// j: 열을 Loop: 0, 1, 2, 3, ....99
						// 10의 배수를 저장하는 변수 선언
						arr1[i][j] = a;
						a += 10;
						
					}
					
				}else if(i == 1) {
					for (int j=0,a=3; j<arr1[i].length; j++,a+=3) {	// j: 열을 Loop: 0, 1, 2, 3, ....99
						// 3의 배수를 저장하는 변수 선언
						arr1[i][j] = a;
						//a+= 3;
					}
					
				}else if(i == 2) {
					for (int j=0,a=3; j<arr1[i].length; a+=3) {	// j: 열을 Loop: 0, 1, 2, 3, ....99
						// 3의 배수를 저장하지만 6의 배수는 저장하지 않음
						if (a%6 == 0) {continue;}			// 6의 배수는 저장하지 않음
						arr1[i][j] = a;
						j++;		// 값을 넣었을 때만 j가 증가하도록 continue 아래에 배치
						
					}
				}else if(i == 3) {
					for (int j=0, a=1; j<arr1[i].length; a++) {	// j: 열을 Loop: 0, 1, 2, 3, ....99
						// 7의 배수, 8의 배수 저장
						// 각 방의 값을 저장하는 변수 선언: a;
						if( (a%7 == 0) || (a%8 == 0) ) {
							arr1[i][j] = a;
							j++;
						}
						
					}
					
				}
				
		}
		
		// 출력 구문
				for (int i=0; i<arr1.length; i++) {
					for (int j=0; j<arr1[i].length; j++) {
						System.out.print(arr1[i][j] + " ");
					}
					System.out.println();
				}
				
				
			}
				
		}