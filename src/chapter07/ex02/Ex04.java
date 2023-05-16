package chapter07.ex02;

class F {
	
	// 1. 메소드: 두 배열의 각 방의 내용을 더해서 출력: int
	void plus (int[] a, int[] b) {
		System.out.println("===두 배열의 덧셈을 출력===");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + b[i] + " ");
		}
	}
	
	// 2. 메소드: 두 배열의 각 방의 내용을 빼서 출력: int
	void minus (int[] a, int[] b) {
		System.out.println("===두 배열의 뺄셈을 출력===");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] - b[i] + " ");
		}
	}
	
	// 3. 메소드: 두 배열의 각 방의 내용을 곱해서 출력: int
	void mul (int[] a, int[] b) {
		System.out.println("===두 배열의 곱셈을 출력===");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] * b[i] + " ");
		}
	}
	
	// 4. 메소드: 두 배열의 각 방의 내용을 나눠서 출력: double
	void div (int[] a, int[] b) {
		System.out.println("===두 배열을 나눗셈 출력===");
		for(int i=0, j=0; i<a.length; i++, j++) {
			System.out.print((double)a[i] / b[j] + " ");
		}
	}
}


public class Ex04 {

	public static void main(String[] args) {
		// 1. 정수를 담는 배열 arr1 방 100개를 생성: 7의 배수만 저장
				// 7 14 21 ...
		int[] arr1 = new int[100];
		for (int i=1,j=0; true; i++) {
			if (i%7 == 0) {
				arr1[j] = i;
				j++;
				if(j == arr1.length) {break;}
			}
		}
		
		// 2. 정수를 담는 배열 arr2 방 100개를 생성: 4의 배수만 저장하는데 8의 배수는 저장하지 않음
				// 4 12 20 ...
		int[] arr2 = new int[100];
		for (int i=1,j=0; true; i++) {
			if (i%4 == 0 && i%8 != 0) {
				arr2[j] = i;
				j++;
				if(j == arr2.length) {break;}
			}
		}
		
		// 객체 생성
		F f = new F();
		
		// 두 배열의 덧셈 출력 메소드 호출
		f.plus(arr1, arr2);
		System.out.print("\n \n");

		// 두 배열의 뺄셈 출력 메소드 호출
		f.minus(arr1, arr2);
		System.out.print("\n \n");
		
		// 두 배열의 곱셈 출력 메소드 호출
		f.mul(arr1, arr2);
		System.out.print("\n \n");
		
		// 두 배열의 나눗셈 출력 메소드 호출
		f.div(arr1, arr2);
		System.out.print("\n \n");
	}

}
