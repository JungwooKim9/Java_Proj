package chapter12.ex01;

abstract class A {
	// 인스턴스 필드: 객체화 해야 사용 가능, Heap에 저장
	int a = 10;
	int b = 20;
	
	// 일반 메소드
	void print () {
		
	}
	
	// 추상 메소드: {구현부(실행)}가 없는 메소드
	abstract void run();
	
}

class Cat extends A {		// 콘크리트 클래스, 추상 클래스에서 선언해놓은 추상 메소드를 구현하는 클래스
	@Override
	void run() {
		System.out.println("고양이는 달립니다.");
	}
}

class Dog extends A {
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
}

class Eagle extends A {
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		/*
		 추상 메소드 (Abstract Method)
		 	- 구현부{ }가 존재하지 않는 메소드, 선언만 되어 있는 메소드
		 	- abstract void abc();
		 	- 추상 메소드가 클래스 블락에 1개라도 존재하면 그 클래스는 반드시 추상 클래스가 되어야 한다. abstract class A { }
		 	- 자식 클래스에서 추상 클래스의 추상 메소드를 오버라이딩해서 메소드를 구현 해야 한다.
		 	- 추상 클래스는 객체 생성이 안됨. 자식 클래스를 객체화 해서 타입으로는 적용할 수 있다.
		 	- 프로젝트를 설계시 메소드 이름을 프로그래머가 함부로 바꾸지 못하도록 할 수 있다. (PM 설계)
		 	- 자식 클래스에서 구현하는 메소드를 오버라이딩 해서 구현부를 만듦.
		 	- 메소드 이름을 함부로 변경할 수 없다.
		 	- 유지 보수를 쉽게하는 프로그램을 만들 때 사용 (강결합 ==> 약결합)
		 	
		 */
		
		// 1. 추상 클래스(객체화 하지 못한다): 추상 메소드를 포함하는 클래스
		// A a = new A();	오류 발생: 객체가 만들어지지 않는다
		
		// 2. 추상 클래스는 타입으로 지정이 가능: 자식을 객체화 해서 부모 타입으로 지정
		A cat1 = new Cat();				// cat1: A / Cat
		A dog1 = new Dog();				// dog1: A / Dog
		A eagle1 = new Eagle();			// eagle1: A / Eagle
		
		// 3. 부모의 추상 메소드를 실행하면 오버라이딩 된 자식 클래스의 메소드가 출력
		cat1.run();
		dog1.run();
		eagle1.run();
		System.out.println("========For문========");
		
		// 4. 배열에 넣고 출력
		A[] arr = new A[] {cat1,dog1,eagle1};
		
		// 5. for문을 사용해서 배열의 각 방의 내용을 출력
		for(int i=0; i<arr.length; i++) {
			arr[i].run();
		}
		System.out.println("=====Enhanced For문=====");
		
		// 6. Enhanced for문을 사용해서 출력
		for (A k : arr) {
			k.run();
		}

	}

}
