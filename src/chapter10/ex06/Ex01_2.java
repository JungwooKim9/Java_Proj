package chapter10.ex06;

class Student1 {
    String name;

    Student1(String name) {
        this.name = name;
    }

    // 합계와 평균을 출력하는 메소드: 부모 클래스의 메소드: 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드를 생성함.
    void sum_avg() {}
}

class Student_Sub1 extends Student1 {
    int kor;
    int eng;
    int math;

    // 1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math
    Student_Sub1(String name, int kor, int eng, int math) {
        super(name);
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균
    @Override
    void sum_avg() {
        int sum = kor + eng + math;
        double avg = sum / 3.0;
        System.out.println(name + " 합계: " + sum + " 평균: " + avg);
    }
}


public class Ex01_2 {

    public static void main(String[] args) {

        // 각 객체의 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요
         /*
          홍길동, 70, 88, 77
          이순신, 80, 68, 87
          김똘똘, 60, 86, 87
          홍길순, 77, 56, 80
          강감찬, 55, 66, 77
          */

        Student stdt1 = new Student_Sub("홍길동", 70, 88, 77);
        Student stdt2 = new Student_Sub("이순신", 80, 68, 87);
        Student stdt3 = new Student_Sub("김똘똘", 60, 86, 87);
        Student stdt4 = new Student_Sub("홍길순", 77, 56, 80);
        Student stdt5 = new Student_Sub("강감찬", 55, 66, 77);

        // Student 타입의 sum_avg() 호출시 오버라이딩 된 메소드 호출
        stdt1.sum_avg();
        stdt2.sum_avg();
        stdt3.sum_avg();
        stdt4.sum_avg();
        stdt5.sum_avg();
    }
}