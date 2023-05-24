package chapter12.ex01;

abstract class Car {	// 추상 클래스: 트럭, 자가용(휘발유), 굴삭기(경유), 봉고(LPG) ...
	
	abstract void run ();
	abstract void eat ();
	
}

class Truck extends Car {

	@Override
	void run() {
		System.out.println("트럭은 달립니다.");
		
	}

	@Override
	void eat() {
		System.out.println("트럭은 기름을 넣습니다.");
		
	}
	
}

class Privatecar extends Car {

	@Override
	void run() {
		System.out.println("자가용은 달립니다.");
		
	}

	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 넣습니다.");
		
	}
	
}

class Excavator extends Car {

	@Override
	void run() {
		System.out.println("굴삭기는 달립니다.");
		
	}

	@Override
	void eat() {
		System.out.println("굴삭기는 경유를 넣습니다.");
		
	}
	
}

class Bongo extends Car {

	@Override
	void run() {
		System.out.println("봉고차는 달립니다.");
		
	}

	@Override
	void eat() {
		System.out.println("봉고차는 LPG를 넣습니다.");
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 구현한 클래스를 생성 후, 자식 객체를 생성시 부모 타입으로 지정 후 오버라이딩된 메소드 호출
		Car c1 = new Truck();
		Car c2 = new Privatecar();
		Car c3 = new Excavator();
		Car c4 = new Bongo();
		c1.eat();
		c1.run();
		c2.eat();
		c2.run();
		c3.eat();
		c3.run();
		c4.eat();
		c4.run();
		
	}

}
