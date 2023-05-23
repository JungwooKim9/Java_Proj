package chapter10.ex06;

class Student_1 {
	//Student(String name){
	//this.name = name;
//}
	String name;
	
	// 합계와 평균을 출력하는 메소드: 부모 클래스의 메소드: 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드를 생성함.
	void sum_avg() {
	}
}

class Student_Sub_1 extends Student_1 {
	int kor;
	int eng;
	int math;
	
	// 1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math
	Student_Sub_1(String name, int kor, int eng, int math) {
		// super();가 생략되어 있음
		// super(name);
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균
	@Override
	void sum_avg() {
		int sum = 0;
		double avg = 0.0;
		sum = kor + eng + math;
		avg = (double)sum / 3;
		System.out.printf("%s님의 국어, 영어, 수학 점수의 총합은 %d이고, 평균은 %.2f점 입니다.\n",name,sum,avg);
	}
	
}


public class Ex01_1 {

	public static void main(String[] args) {
		
		// 각 객체의 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요
			/*
			 홍길동, 70, 88, 77
			 이순신, 80, 68, 87
			 김똘똘, 60, 86, 87
			 홍길순, 77, 56, 80
			 강감찬, 55, 66, 77
			 */

		Student_1 s1 = new Student_Sub_1("홍길동",70,88,77);
		Student_1 s2 = new Student_Sub_1("이순신",80,68,87);
		Student_1 s3 = new Student_Sub_1("김똘똘",60,86,87);
		Student_1 s4 = new Student_Sub_1("홍길순",77,56,80);
		Student_1 s5 = new Student_Sub_1("강감찬",55,66,77);
		
		
		// Student 타입의 sum_avg() 호출시 오버라이딩 된 메소드 호출
		s1.sum_avg();
		s2.sum_avg();
		s3.sum_avg();
		s4.sum_avg();
		s5.sum_avg();
		
		System.out.println("===========================================");
		// 배열에 넣고
		Student_1[] arr = new Student_1[] {s1,s2,s3,s4,s5};
		
		//for문을 사용해서 배열의 메소드 호출
		for(int i=0; i<arr.length; i++) {
			arr[i].sum_avg();
		}
		
		System.out.println("===========================================");
		// for문을 사용해서 아래와 같이 출력되도록 구문 작성하세요
		// 모든 사용자의 국어 점수의 총합: 000점
		// 모든 사용자의 영어 점수의 총합: 000점
		// 모든 사용자의 수학 점수의 총합: 000점
	/*	int sumKor = ((Student_Sub_1)s1).kor + ((Student_Sub_1)s2).kor + ((Student_Sub_1)s3).kor +
				((Student_Sub_1)s4).kor + ((Student_Sub_1)s5).kor;
		int sumEng = ((Student_Sub_1)s1).eng + ((Student_Sub_1)s2).eng + ((Student_Sub_1)s3).eng +
				((Student_Sub_1)s4).eng + ((Student_Sub_1)s5).eng;
		int sumMath = ((Student_Sub_1)s1).math + ((Student_Sub_1)s2).math + ((Student_Sub_1)s3).math +
				((Student_Sub_1)s4).math + ((Student_Sub_1)s5).math;
		
		for(int i=0; i<3; i++) {
			if (i == 0) {
			System.out.printf("모든 사용자의 국어 점수의 총합: %d점\n",sumKor);
			} else if (i == 1) {
				System.out.printf("모든 사용자의 영어 점수의 총합: %d점\n",sumEng);
			} else {
				System.out.printf("모든 사용자의 수학 점수의 총합: %d점\n",sumMath);
			}
		}
	*/
		
		// 배열로 변수 선언
		int[] sum = new int[3];		// sum[0]: 국어 점수의 합, sum[1]: 수학 점수의 합, sum[2]: 수학 점수의 합
		
		for(int i=0; i<arr.length; i++) {
			sum[0] += ((Student_Sub_1)arr[i]).kor;		// sum[0] = sum[0] + kor
			sum[1] += ((Student_Sub_1)arr[i]).eng;
			sum[2] += ((Student_Sub_1)arr[i]).math;
		}
		System.out.println("모든 사용자의 국어 점수의 총합은: " + sum[0]);
		System.out.println("모든 사용자의 영어 점수의 총합은: " + sum[1]);
		System.out.println("모든 사용자의 수학 점수의 총합은: " + sum[2]);
		
	}

}
