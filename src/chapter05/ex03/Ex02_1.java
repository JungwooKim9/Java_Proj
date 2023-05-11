package chapter05.ex03;

public class Ex02_1 {

	public static void main(String[] args) {
		
		/*
		 배열방 1000개를 생성, 정수 배열, 
		 4의 배수를 담는데 8의 배수는 담지 않도록 저장
		 
		 출력은 10개씩 끊어서 출력, for문을 사용해서 출력
		 */
		
		int[] arr1 = new int[1000];		// 배열방 1000개 생성,	index: 0 ~ 999번
		
		// 각 배열 방에 값을 Insert
		for (int i=0, a=1; true; a++) {		// i: 방 번호, a: 값
			if ( i == 1000 ) break;
			
			if( (a%4 == 0) && (a%8 != 0) ) {		// 4의 배수이면서, 8의 배수가 아닐 때
				arr1[i] = a;
				i++;		// i: 999
			}
		}
		// 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
			
			if( (i+1) % 10 == 0 ) {
				System.out.println();
			}
			
		}
		
	}

}
