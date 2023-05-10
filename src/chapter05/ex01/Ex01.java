package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 배열 방 100개를 생성 후 3의 배수만 저장 후 출력
		 
		 */
		
		int[] arr1 = new int[100];
		int j = 3;
		for (int i=0; i<arr1.length; i++, j+=3) {		
			arr1 [i] = j;
		}
		for(int i=0; i<arr1.length; i++)
		System.out.println("arr3 변수의 [" + i + "] 번째 방의 값을 출력: " +  arr1[i]);
		
	}

}
