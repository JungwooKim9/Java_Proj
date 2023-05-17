package chapter07.ex04;

public class Ex01_1 {
	
	// 두 배열의 각 방의 내용을 더해서 출력
	public static void arrSum(int[] a, int[] b) {
		// for문을 사용해서 각 배열의 방의 값을 더해서 출력
		int[] c = new int[71];		// 제일 큰 배열의 방의 크기를 지정함. 두 배열의 더한 값을 저장하는 배열
		
		for(int i=0, j=0; i<a.length; i++,j++) {			// a 배열의 index 0 ~ 70	<== i
			if (i > 54) {
				c[i] = a[i];
			} else {
				c[i] = a[i] + b[i];							// b 배열의 index 0 ~ 54	<== j
			}
			System.out.print(c[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] a;		// 0 ~ 500까지 7의 배수를 저장하는 배열, 방의 크기: 500 / 7
		int[] b;		// 0 ~ 500까지 9의 배수를 저장하는 배열, 방의 크기: 500 / 9
		
		a = new int[500/7];				// a: 500까지 저장할 방의 크기 지정: 7배수
		b = new int[500/9];				// b: 500까지 저장할 방의 크기 지정: 9배수
		
		// 1. for문을 사용해서 배열 a에 7의 배수 저장
		for(int i=0,j=7; i<a.length; i++) {
			a[i] = j;
			System.out.print(a[i] + " ");
			j+=7;
		}
		System.out.println();
		
		// a 배열 방의 갯수
		System.out.println(a.length);		// 71: 방의 갯수: index 0 ~ 70
		System.out.print("\n \n");
		
		// 2. for문을 사용해서 배열 b에 9의 배수 저장
		for(int i=0, j=9; i<b.length; i++) {
			b[i] = j;
			j += 9;
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// b 배열 방의 갯수
		System.out.println(b.length);		// 55: 방의 갯수: index 0 ~ 54
		System.out.print("\n \n");
		
		// 각 방의 내용을 더해서 출력
		arrSum(a, b);		// 각 방의 내용을 더해서 출력, a:71, b:55
		
	}
}
