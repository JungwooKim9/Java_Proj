package chapter05.ex04;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 arr1 = 4행 100열의 2차원 배열 방을 생성하세요.
		 	0행: 10의 배수만 저장
		 	1행: 3의 배수만 저장
		 	2행: 3의 배수를 저장하지만 6의 배수는 저장하지 않음
		 	3행: 7의 배수, 8의 배수 저장
		 	
		 	//for문을 사용해서 출력
		 */
		
		// 방 크기 선언
		int arr1[][] = new int[4][100];

		// 0행: 10의 배수만 저장
		for(int i=0, a=1; true; a++) {
			if(a%10 == 0) {
				arr1[0][i] = a;
				i++;
			}
			if(i == arr1[0].length) {break;}
		}
		
		// 1행: 3의 배수만 저장
		for(int i=0, a=1; true; a++) {
			if(a%3 == 0) {
				arr1[1][i] = a;
				i++;
			}
			if(i == arr1[1].length) {break;}
		}
		
		// 2행: 3의 배수를 저장하지만 6의 배수는 저장하지 않음
		for(int i=0, a=1; true; a++) {
			if( (a%3 == 0) && (a%6 != 0)) {
				arr1[2][i] = a;
				i++;
			}
			if(i == arr1[2].length) {break;}
		}
		
		// 3행: 7의 배수, 8의 배수 저장
		for(int i=0, a=1; true; a++) {
			if( (a%7 == 0) || (a%8 == 0)) {
				arr1[3][i] = a;
				i++;
			}
			if(i == arr1[3].length) {break;}
		}
		
		// for - for문으로 출력
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
