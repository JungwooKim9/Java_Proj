package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. Scanner 등록 (ctrl + shift + o) 
		Scanner sc = new Scanner(System.in);

		// 프로그램 선택 변수
		int select;		// 1. 학점의 합계/평균,		2. 홀수, 짝수 확인,		3. 같은 이름을 식별
		
		// 국어 / 영어 / 수학 점수를 인풋 받는 변수 선언
		int kor;
		int eng;
		int math;
		
		// 정수 값을 인풋 받아서 홀수/짝수인지 확인하는 프로그램에 사용하는 변수
		int a;
		
		// 두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		String aName;
		String bName;
		
		System.out.println("=============================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름 식별");
		System.out.println("=============================================");
		
		// 프로그램 선택
		System.out.println("위 프로그램 번호를 입력하세요>>");
		select = sc.nextInt();
		
		// if 조건으로 프로그램을 실행
		if (select == 1) {
			// 스캐너로부터 국어/영어/수학 점수를 인풋 받아서 합계와 평균을 출력
			System.out.println("국어 영어 수학 점수를 공백/엔터로 정수 값으로 순서대로 입력하세요");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			int sum = kor + eng + math;		// sum 지역 변수: 블락 내에서만 사용됨
			double avg = sum / 3.0;			// avg 평균: double
			System.out.println("국어, 영어, 수학 점수 합계는 " + sum + "이고, 평균 점수는 " + avg + "점 입니다.\n");
			// System.out.printf("입력한 국어 영어 수학의 합계는 %d이고, 평균은 %5.2f입니다.\n\n", sum, avg);
			System.out.println("1번 항목을 출력 했습니다.");
			
		} else if (select == 2) {
			// a변수에 정수 값을 인풋 받아서 홀수인지 짝수인지 출력
			System.out.println("정수 값을 입력하세요.");
			a = sc.nextInt();
			
			if (a%2 == 0) {
				System.out.println("짝수 입니다.\n");
			} else {
				System.out.println("홀수 입니다.\n");
			}
			// System.out.println((a % 2 == 0) ? "짝수 입니다." : "홀수 입니다.");	 <== 같은 프로그램 3항 연산자로 만들기
			
			System.out.println("2번 항목을 출력 했습니다.");
			
		} else if (select == 3) {
			// aName, bName 두 변수의 문자열을 인풋 받아서 두 문자열이 같은 이름인지 식별
			System.out.println("비교할 두 문자열을 공백/엔터로 구분해서 입력하세요.");
			aName = sc.next();
			bName = sc.next();
			if (aName.equals(bName)) {		// String에서 두 값을 비교하는 것이 equals	<== heap에 저장된 값
				System.out.println("같은 문자열 입니다.\n");
			} else {
				System.out.println("다른 문자열 입니다.\n");
			}
			
			System.out.println("3번 항목을 출력 했습니다.");
		}
		
		
		// 스캐너 종료: 사용 후 메모리에서 제거
		sc.close();
	}

}
