package chapter10.ex03;

class Customer {
	
	void memberInfo() {
		System.out.println("회원님은 기본 회원입니다.");
	}
}

class Gold extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 골드 회원입니다.");
	}
}

class Silver extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 실버 회원입니다.");
	}
}

class Bronze extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 브론즈 회원입니다.");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		// 자식을 객체화 해서 부모 타입으로 지정
		// 부모의 메소드 호출시 오버라이딩 된 메소드 출력
		// for / Enhanced For문에 넣어서 출력
		
		Customer c1 = new Gold();
		Customer c2 = new Silver();
		Customer c3 = new Bronze();
		
		System.out.println("=======부모의 메소드 호출시 오버라이딩 된 메소드 출력=======");
		c1.memberInfo();
		c2.memberInfo();
		c3.memberInfo();
		
		System.out.println("==========For문으로 배열에 저장된 객체를 출력==========");
		
		Customer[] arr = new Customer[] {c1,c2,c3};

		for (int i=0; i<arr.length; i++) {
			arr[i].memberInfo();
		}
		
		System.out.println("======Enhanced For문으로 배열에 저장된 객체를 출력======");
		for (Customer k : arr) {
			k.memberInfo();
		}
		
		
	}

}
