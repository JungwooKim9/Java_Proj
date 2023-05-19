package chapter10.ex03;

class Animal {
	void cry () {
		System.out.println("모든 동물은 웁니다.");
	}
}

class Tiger extends Animal {
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Eagle extends Animal {
	@Override
	void cry() {
		System.out.println("끼룩");
	}
}

class Lion extends Animal {
	@Override
	void cry() {
		System.out.println("크앙");
	}
}

public class Method_Overriding02 {

	public static void main(String[] args) {
		
		// 1. Animal을 Animal 타입으로 객체화
		Animal a1 = new Animal();
		a1.cry();			// Animal 클래스의 cry가 호출됨
		
		// 2. 자식을 객체화 하면서 부모 타입으로 선언: 오버라이딩된 메소드가 출력
		Animal a2 = new Tiger();
		a2.cry();			// a2.cry() <== Animal의 메소드 호출이지만, 오버라이딩된 메소드가 출력됨
		
		Animal a3 = new Eagle();
		a3.cry();
		
		Animal a4 = new Lion();
		a4.cry();

	}

}
