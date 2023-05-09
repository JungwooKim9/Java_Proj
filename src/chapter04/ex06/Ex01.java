package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 스캐너로 번호를 입력 받고 각 프로그램을 출력하는 프로그램을 작성
		// for문 블락 내에서 scanner를 인풋 받는다.
		Scanner sc = new Scanner(System.in);
		int key;
		
		
		do {
		
		System.out.println("===========================================");
		System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
		System.out.println("2. 10 이하의 정수를 입력 받아 정수 만큼 \"JAVA 프로그래밍\"이라고 출력하는 프로그램");
		System.out.println("3. 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
		System.out.println("4. 입력 받은 정수 만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
		System.out.println("5. 프로그램 종료");
		System.out.println("===========================================");
		System.out.println("위 번호를 입력해주세요 >>");
		
		key = sc.nextInt();
		if (key == 1) {
			System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			for (int a=1; a<21; a++) {
				if (a%2 == 0) { continue; }
				System.out.println(a);
			}
			System.out.println();
			
		} else if (key == 2) {
			System.out.println("2. 10 이하의 정수를 입력 받아 정수 만큼 \"JAVA 프로그래밍\"이라고 출력하는 프로그램");
			System.out.println("10 이하의 정수를 입력하세요 >>");
			int n = sc.nextInt();
			for (int i=1; i<n+1; i++) {
				if (i > 10) {
					System.out.println("잘못 입력하였습니다(10이하의 정수를 입력하세요)");
				}
				System.out.println("\"JAVA 프로그래밍\"" + i);
			}
			System.out.println();
			
			
		} else if (key == 3) {
			System.out.println("3. 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("10개의 정수를 공백/엔터로 구분하여 입력해주세요 >>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			int g = sc.nextInt();
			int h = sc.nextInt();
			int i = sc.nextInt();
			int j = sc.nextInt();
			int n=0;
			
			if (a%2 == 0) {
				n++;
			}if (b%2 == 0) {
				n++;
			}
			if (c%2 == 0) {
				n++;
			}
			if (d%2 == 0) {
				n++;
			}
			if (e%2 == 0) {
				n++;
			}
			if (f%2 == 0) {
				n++;
			}
			if (g%2 == 0) {
				n++;
			}
			if (h%2 == 0) {
				n++;
			}
			if (i%2 == 0) {
				n++;
			}
			if (j%2 == 0) {
				n++;
			}
			System.out.println("짝수는 총 " + n + "개 입니다.");
			
		} else if (key == 4) {
			System.out.println("4. 입력 받은 정수 만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
			int kor;
			int eng;
			int math;
			System.out.println("국어 영어 수학 점수를 공백/엔터로 구분하여 입력하세요 >>");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			int sum = kor + eng + math;
			double avg = sum / 3.0;
			System.out.printf("국어 영어 수학 총점은 %d이고 평균은 %5.2f점 입니다", sum, avg);
			System.out.println();
			
		} else if (key == 5) {
			System.out.println("5. 프로그램 종료");
			break;
			
		} else {
			System.out.println("잘못 입력하였습니다(1 ~ 5사이에 정수를 입력해주세요)");
		}
		
		} while (true);
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}

}
