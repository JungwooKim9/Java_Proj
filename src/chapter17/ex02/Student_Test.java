package chapter17.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Test {

	public static void main(String[] args) {
		
		// ArrayList 변수 선언: <Student>
		List <Student> aList = new ArrayList();
		Scanner sc = new Scanner(System.in);		// 콘솔로부터 인풋
		
		boolean run = true;
		int studentNum = 0;		// 스캐너로 학생 수를 인풋 받는 변수
		
		while (run) {
			System.out.println("=============================================================");
			System.out.println("1. 학생수 입력 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 프로그램 종료");
			System.out.println("=============================================================");
			System.out.println("위에 번호 중 하나의 정수를 입력하세요 >>");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				// 스캐너로 학생수를 인풋 받아서 studentNum 변수에 할당합니다.
				System.out.println("1. 학생수를 입력하세요 >>");
				studentNum = sc.nextInt();
				System.out.println("입력한 학생수는 " + studentNum + "입니다.");
				System.out.println();
				
			} else if (selectNo == 2) {
				// 학생수가 인풋되지 않으면 먼저 학생수를 입력하세요 메세지 출력
				if (studentNum == 0) {
					System.out.println("먼저 학생수를 입력해야합니다. [1. 학생수 입력]을 선택하세요.");
				} else {
					// 학생수에 대한 각각의 student 객체를 생성 후 점수를 스캐너로 입력 받고 aList에 저장합니다.
					for(int i=0; i<studentNum; i++) {
						System.out.println("2. 점수를 입력하세요 >>");
						Student s1 = new Student();		// Student 객체 생성
						int score = sc.nextInt();		// 스캐너로 점수를 인풋 받도록 함.
						// 스캐너로 인풋 받은 값을 Student 객체에 setter를 사용해서 저장
						s1.setScore(score);
						aList.add(s1);
					}
					System.out.println("학생의 점수 입력이 완료되었습니다.");
					System.out.println();
					
					
				}
				
			} else if (selectNo == 3) {
				// 점수의 리스트를 출력, aList의 Student
				if (studentNum == 0) {
					System.out.println("먼저 학생수를 입력해야합니다. [1. 학생수 입력]을 선택하세요.");
				} else if (aList.isEmpty()) {
					System.out.println("먼저 점수를 입력해야합니다. [2. 점수 입력]을 선택하세요.");
				} else {
					// aList의 Student 객체를 끄집어 내서 출력
					System.out.println("3. 점수 리스트를 출력합니다.");
					for (int i=0; i<aList.size(); i++) {
						System.out.print(aList.get(i).getScore() + " ");
					}
					System.out.print("\n \n");
					
				}
				
			} else if (selectNo == 4) {
				// 최대점수 출력
				// 평균 출력
				int maxScore = 0;
				int sum = 0;
				double avg = 0.0;
				
				// aList에 Student 객체에 getScore를 사용하여 점수를 끄집어 내서 처리
				for(int i=0; i<aList.size(); i++) {
					Student s1 = aList.get(i);
					
					// 점수: 객체의 getter를 사용해서 점수를 받아온다.
					int score = s1.getScore();
					sum += score;		// sum = sum + score
					
					// 최대 점수를 maxScore 변수에 할당: if 조건이나 삼항 연산자로 처리 가능
					if (score > maxScore) {
						maxScore = score;
					}
				}
				avg = (double) sum / aList.size();
				System.out.println("최대 점수: " + maxScore);
				System.out.println("평균 점수: " + avg);
				System.out.println();
				
			} else if (selectNo == 5) {
				// while문을 빠져 나옴
				break;
				// run = false; <= 대체 가능
			} else {
				System.out.println("잘못된 번호를 입력했습니다. 1 ~ 5번 중 입력하세요.");
			}
			System.out.println();
			
			
		}
		
		System.out.println("프로그램 종료됨");
		sc.close();
		
	}

}
