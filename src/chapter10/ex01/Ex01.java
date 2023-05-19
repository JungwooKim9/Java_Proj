package chapter10.ex01;

// 부모 클래스 (Animal): 동물
class Animal {
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}
	
	void sleep() {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
}

// 자식 클래스 (Tiger, Eagle, Lion ===> Animal)		// 추가적으로 필드1: 00Sound, 메소드1: 00Run
class Tiger extends Animal {
	
	String tigerSound;
	
	void tigerRun () {
		System.out.println("Tiger - 껑충껑충");
	}
	
}

class Eagle extends Animal {
	
	String eagleSound;
	
	void eagleRun () {
		System.out.println("Eagle - 파닥파닥");
	}
	
}

class Lion extends Animal {
	
	String lionSound;
	
	void lionRun () {
		System.out.println("Lion - 펄쩍펄쩍");
	}
	
}

// 자식의 자식 클래스 (LionChild ===> Lion)
class LionChild extends Lion {
	
	String lionChildSound;
	
	void lionChildRun () {
		System.out.println("LionChild - 뒤뚱뒤뚱");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		// 부모: Animal 클래스 생성
		Animal a1 = new Animal();		// a1은 Animal 타입만 존재
		
		// 자식: Tiger, Eagle, Lion ===> Animal
		System.out.println("=====Tiger=====");
		Tiger t1 = new Tiger();			// t1: Tiger, Animal 타입 존재
		t1.name = "호랑이";
		t1.color = "주황색";
		t1.tigerSound = "어흥";
		
		t1.eat();
		t1.sleep();
		t1.tigerRun();
		
		System.out.println("=====Eagle=====");
		Eagle e1 = new Eagle();			// e1: Eagle, Animal
		e1.name = "독수리";
		e1.color = "검은색";
		e1.eagleSound = "끼엑";
		
		e1.eat();
		e1.sleep();
		e1.eagleRun();
		
		System.out.println("=====Lion=====");
		Lion l1 = new Lion();			// l1: Lion, Animal
		l1.name = "사자";
		l1.color = "갈색";
		l1.lionSound = "크르릉";
		
		l1.eat();
		l1.sleep();
		l1.lionRun();
		
		// 자식의 자식 : LionChild ===> Lion
		
		System.out.println("=====LionChild=====");
		LionChild lc1 = new LionChild();	// lc1: LionChild, Lion, Animal
		lc1.name = "새끼 사자";
		lc1.color = "살색";
		lc1.lionSound = "크르릉";
		lc1.lionChildSound = "응애";
		
		lc1.eat();
		lc1.sleep();
		lc1.lionRun();
		lc1.lionChildRun();
		
	}

}
