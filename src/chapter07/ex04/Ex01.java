package chapter07.ex04;

public class Ex01 {
	
	// 두 배열의 각 방의 내용을 더해서 출력
	public static void arrSum(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			System.out.print(a[i] + b[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] a;		// 0 ~ 500까지 7의 배수를 저장하는 배열
		int[] b;		// 0 ~ 500까지 9의 배수를 저장하는 배열
		int k=0;
		int k2=0;
		
		System.out.println("===0 ~ 500까지 7의 배수를 저장하는 배열===");
		// 0 ~ 500까지 7의 배수를 저장하는 배열
		for(int j=7; true; j+=7) {
			if(j <= 500) {
				k++;
			}else {break;}
		}
		
		a = new int[k];
		
		for(int i=0,j=7; i<k; i++,j+=7) {
			if(j <= 500) {
			a[i] = j;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n \n");
		
		
		System.out.println("===0 ~ 500까지 9의 배수를 저장하는 배열===");
		// 0 ~ 500까지 9의 배수를 저장하는 배열
		for(int j=9; true; j+=9) {
			if(j <= 500) {
				k2++;
			}else {break;}
		}
		
		b = new int[k2];
		
		for(int i=0,j=9; i<k; i++,j+=9) {
			if(j <= 500) {
			b[i] = j;
			}
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("\n \n");
		
		System.out.println("===두 배열의 합===");
		// 각 방의 내용을 더해서 출력
		arrSum(a, b);
		
	}
}
