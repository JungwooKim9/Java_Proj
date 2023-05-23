package chapter10.ex06;

class Student {
	String name;
	
	// 합계와 평균을 출력하는 메소드: 부모 클래스의 메소드: 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드를 생성함.
	void sum_avg() {
		
	}
}

class Student_Sub extends Student {
	int kor;
	int eng;
	int math;
	
	// 1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math
	Student_Sub(String name, int kor, int eng, int math) {
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum_avg(name, kor, eng, math);
	}
	
	
	// 2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균
	@Override
	void sum_avg() {
	}
	
	void sum_avg(String name, int kor, int eng, int math) {
		int sum = 0;
		sum = kor + eng + math;
		
		double avg = sum / 3.0;
		
		System.out.printf("%s의 점수 합계는 %d이고, 점수의 평균은 %.2f입니다.\n", name, sum, avg);
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		// 각 객체의 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요
			/*
			 홍길동, 70, 88, 77
			 이순신, 80, 68, 87
			 김똘똘, 60, 86, 87
			 홍길순, 77, 56, 80
			 강감찬, 55, 66, 77
			 */

		Student ss1 = new Student_Sub("홍길동",70,88,77);
		Student ss2 = new Student_Sub("이순신",80,68,87);
		Student ss3 = new Student_Sub("김똘똘",60,86,87);
		Student ss4 = new Student_Sub("홍길순",77,56,80);
		Student ss5 = new Student_Sub("강감찬",55,66,77);
		
		
		// Student 타입의 sum_avg() 호출시 오버라이딩 된 메소드 호출
		
	}

}
