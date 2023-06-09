package chapter07.ex04;

class A {
	// 필드: Heap 공간에 값이 저장이 됨, 객체를 생성(new) 후 Heap에 저장
	int m;
	int n;
	
	// 메소드
	void init (int a, int b) {	// 지역변수(a,b,c): 메소드 내부에서 선언된 변수
		int c;
		c = 3;
		this.m = a;		// this가 생략되어도 컴파일시 자동으로 등록함(변수명이 겹치지 않기 때문에 생략 가능)
		this.n = b;
		System.out.println("필드의 값 출력: " + m + ", " + n);
	}
	
	void work() {
		this.init(2, 3);	// 생략시 컴파일러가 자동으로 등록함
	}
	
	
	
}

public class This_ThisMethod {

	public static void main(String[] args) {
		/*
		 this 키워드: 필드 이름 앞, 메소드 이름 앞에 들어갈 수 있음
		 			자기 자신의 객체를 의미함
		 			기본적으로 모두 생략되어 있다.
		 			명시가 필요한 경우: 생성자에서 인풋되는 변수 이름, 인풋 받는 변수 이름, 필드명 모두 동일할 때 필드명에 this키워드를 넣음
		 this() 메소드: 
		 	생성자 내부에서만 사용됨.
		 	반드시 생성자 내부에서 첫 번째 라인에 와야 한다.
		 	생성자 호출시 다른 생성자를 먼저 실행하도록 한다.
		 */
		
		// 객체 생성
		A a = new A();
		a.work();

	}

}
