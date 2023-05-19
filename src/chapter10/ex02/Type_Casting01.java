package chapter10.ex02;

class Animal {	// 부모 클래스
	String name;
	int age;
	
	void eat () {
		System.out.println("모든 동물은 먹습니다.");
	}
}

// 자식 클래스 (Tiger, Lion)

class Tiger extends Animal {
	
	String tigerCry;
	void tigerRun() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Lion extends Animal {
	String lionCry;
	void lionRun() {
		System.out.println("사자는 달립니다");
	}
}

// 자식의 자식 클래스 (LionChild)
class LionChild extends Lion {
	String lionChildCry;
	void lionChildRun() {
		System.out.println("새끼 사자는 엉금엉금 기어갑니다.");
	}
}

public class Type_Casting01 {

	public static void main(String[] args) {
		/*
		 객체의 타입 변환(Object Type Casting)
		 	- 업캐스팅(upcasting):		자식 타입 ==> 부모 타입으로 변환, 명시하지 않아도 자동 변환
		 		객체를 배열이나 컬렉션에 저장하기 위해서 동일한 타입으로 배열이나 컬렉션에 저장
		 		
		 	- 다운캐스팅(downcasting):	부모 타입 ==> 자식 타입으로 변환, 명시해서 변환
		 			-- instanceof를 사용해서 자식 타입이 존재하는지 살펴보고 다운 캐스팅
		 			-- 만약에 자식 타입이 존재하지 않을 경우 실행시 오류 발생
		 */

		// 1. Animal
		Animal a1 = new Animal();		// a1은 Animal 타입만 존재함.
		
		// a1은 Animal 타입만 존재: Animal 클래스의 필드와 메소드만 접근 가능
			// a1: Tiger, Lion, LionChild의 타입을 가지고 있지 않다. (접근 불가)
		a1.age = 10;
		a1.name = "동물";
		a1.eat();
		
		// 2. Tiger
		Tiger t1 = new Tiger();			// t1은 Tiger, Animal 타입을 가진다.
		
		// t1: Tiger / Animal
		t1.tigerCry = "어흥";				// Tiger 필드
		t1.tigerRun();					// Tiger 메소드
		
		t1.name = "호랑이";				// Animal 필드
		t1.age = 20;					// Animal 필드
		t1.eat();						// Animal 메소드
		
		// 업캐스팅(upcasting): 자식 타입을 부모 타입으로 변환: t1(Animal(부모),Tiger(자식))
		Animal a2 = t1;			// Tiger ==> Animal 업캐스팅(Animal 타입의 필드나 메소드만 접근 가능)
		
		// a2는 Animal 타입으로 업캐스팅: Animal의 필드/메소드만 접근
		System.out.println(a2.name);
		System.out.println(a2.age);
	//	System.out.println(a2.tigerCry);	// Tiger의 필드/메소드는 접근 안됨
		
		System.out.println("============================");
		
		// a2는 Animal 타입으로 정의: Tiger / Animal
		
		// 다운 캐스팅: 부모 타입을 자식 타입으로 변환: 명시해서 변환, 반드시 intanceof를 사용해서 실행시 오류 나지 않도록 처리가 필요함
		Tiger tt1 = (Tiger) a2;
		
		// tt1은 Tiger 타입으로 다운 캐스팅: Tiger/Animal	<== 부모/자식의 필드/메소드 모두 사용 가능
		System.out.println(tt1.name);		// Animal
		System.out.println(tt1.age);		// Animal
		System.out.println(tt1.tigerCry);	// Tiger
		
		System.out.println("============================");
		
		// 3. Lion 객체를 생성: l1: Lion / Animal
			// 자식 클래스를 객체화 시키면 부모 클래스의 필드/메소드까지 사용 가능
		Lion l1 = new Lion();
			// Lion 필드/메소드, Animal 필드/메소드 모두 사용 가능
		
		// 업 캐스팅: Lion(l1) ==> Animal(aa2)
		Animal aa2 = l1;
		
			// aa2는 Animal의 필드/메소드만 접근 되고, Animal / lion
		// 다운 캐스팅: Animal(부모) ==> Lion(자식)
			// Lion 필드/메소드, Animal 필드/메소드 모두 사용 가능
		Lion ll1 = (Lion) aa2;
		
		System.out.println("============================");
		
		// 객체 내부에 해당 타입이 존재하면 true, 존재하지 않으면 false
		System.out.println(ll1 instanceof Animal);	// true
		System.out.println(ll1 instanceof Lion);	// true
		System.out.println(a1 instanceof Tiger);	// false
		System.out.println(a1 instanceof Animal);	// true
		
		// a1: Animal
		// 객체 내부에 해당 타입이 존재하지 않는 경우 실행시 오류가 발생/ 컴파일 단계에서는 오류 발생하지 않음.
		if(a1 instanceof Tiger) {		// false: a1 객체는 Tiger 타입이 존재하지 않음
		Tiger ttt1 = (Tiger) a1;
		}else {
			System.out.println("해당 객체는 Tiger타입이 존재하지 않습니다.");
		}
		
	//	Tiger tt22 = (Tiger) a1;
		
		// 4. LionCild: LionChild / Lion / Animal
		LionChild lc1 = new LionChild();
		
		lc1.age = 30;			// Animal
		lc1.lionCry = "어흥";		// Lion
		lc1.lionChildCry = "응애";	// LionChild
		
		// LionChild ===> Animal 업캐스팅
		Animal a5 = lc1;
			// a5는 Animal의 필드/메소드만 접근 가능: 업캐스팅은 되었지만 여전히 LionChild / Lion / Animal 세 타입을 가지고 있어서 다운 캐스팅 가능
		
		System.out.println(a5 instanceof Animal);
		System.out.println(a5 instanceof Lion);
		System.out.println(a5 instanceof LionChild);
		
		Lion ll7 = null;		// 객체의 초기화 null
		// 다운 캐스팅: Animal ==> Lion
		if (a5 instanceof Lion) {
			ll7 = (Lion) a5;
			System.out.println("a5는 Lion 타입으로 잘 캐스팅 되었습니다.");
		}else {
			System.out.println("a5는 Lion 타입으로 다운 캐스팅 할 수 없습니다.");
		}
		
		// ll7: Lion / Animal 접근 가능, LionChild / Lion / Animal을 내포하고 있음(다운 캐스팅 가능)
		ll7.lionCry = "어흥 어흥 어흥";	// Lion
		ll7.age = 30;	// Animal
		
		// LionChild로 다운 캐스팅
		LionChild lc9 = (LionChild) ll7;
		
	}

}
