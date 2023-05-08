package chapter04.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 스캐너로 1 ~ 9까지의 정수를 인풋 받아서 for문을 사용해서
		 인풋 받은 단수를 출력
		 1. println()으로 출력
		 2. printf()으로 출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("몇 단을 출력하시겠습니까? >>");
		a = sc.nextInt();
		System.out.println("===println()으로 출력===");
		for (int b=1; b<10; b++) {
			System.out.println(a + " x " + b + " = " + a*b);
		}
		
		System.out.println();
		
		System.out.println("===printf()으로 출력===");
		for (int b=1; b<10; b++) {
			System.out.printf("%d x %d = %d\n", a, b, a*b);
		}
		
		sc.close();
		
	}
	
}
