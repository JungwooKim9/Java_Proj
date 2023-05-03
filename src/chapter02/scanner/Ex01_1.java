package chapter02.scanner;

import java.util.Scanner;

public class Ex01_1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String fName;
		String mName;
		String bName;
		String myName;
		
		int fAge;
		int mAge;
		int bAge;
		int myAge;
		
		System.out.println("아버님이름 어머님이름 형제이름 나의이름을 공백을 구분해서 입력하세요 >>>>");
		fName = sc.next();
		mName = sc.next();
		bName = sc.next();
		myName = sc.next();
		
		System.out.println("아버님나이 어머님나이 형제나이 나의나이를 공백을 구분해서 정수로 입력하세요 >>>>");
		fAge = sc.nextInt();
		mAge = sc.nextInt();
		bAge = sc.nextInt();
		myAge = sc.nextInt();
		
		int sum = fAge + mAge + bAge + myAge;
		double avg = sum / 4.0;
		
		// 변수의 값을 출력
		System.out.printf("아버님 이름은 %s, 어머님 이름은 %s, 형제 이름은 %s, 나의 이름은 %s\n",
				fName, mName, bName, myName);
		
		System.out.printf("아버님 나이는 %d, 어머님 나이는 %d, 형제 나이는 %d, 나의 나이는 %d\n\n",
				fAge, mAge, bAge, myAge);
		System.out.printf("우리 가족의 나이 합계는 %d, 평균은 %5.2f\n", sum, avg);
		
}
	
}
