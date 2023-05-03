package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. Scanner 등록
		// 2. 아버님 이름, 어머님 이름, 형제 이름, 자신 이름	: sc.next();
			// 아버님 나이, 어머님 나이, 형제 나이, 자신 나이	: sc.nextInt();
		// 3. 스캐너로 받은 변수의 값을 출력
		// 4. 전체 나이의 합계, 평균을 구해서 소수점 이하 2자리까지만 출력
		
		String fotherName;
		String motherName;
		String brotherName;
		String myName;
		int fotherAge;
		int motherAge;
		int brotherAge;
		int myAge;
		
		System.out.println("아버님의 이름을 입력하세요 >>>");
		fotherName = sc.next();
		System.out.println("아버님의 나이를 입력하세요 >>>");
		fotherAge = sc.nextInt();
		
		System.out.println("어머님의 이름을 입력하세요 >>>");
		motherName = sc.next();
		System.out.println("어머님의 나이를 입력하세요 >>>");
		motherAge = sc.nextInt();
		
		System.out.println("형제의 이름을 입력하세요 >>>");
		brotherName = sc.next();
		System.out.println("형제의 나이를 입력하세요 >>>");
		brotherAge = sc.nextInt();
		
		System.out.println("자신의 이름을 입력하세요 >>>");
		myName = sc.next();
		System.out.println("자신의 나이를 입력하세요 >>>");
		myAge = sc.nextInt();
		
		int sum = fotherAge + motherAge + brotherAge + myAge;
		double avg = sum / 4.0;
		
		System.out.printf("아버님의 이름은 %s이고 나이는 %d세, 어머님의 이름은 %s이고 나이는 %d세,\n"
				+ "형제의 이름은 %s이고 나이는 %d세, 자신의 이름은 %s이고 나이는 %d세 입니다.\n",
				fotherName, fotherAge, motherName, motherAge, brotherName, brotherAge, myName, myAge);
		
		System.out.printf("가족의 나이 합계는 %d이고, 나이의 평균 값은 %5.2f입니다.", sum, avg);
		
	}
	
}
