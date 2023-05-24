package chapter10.ex07;

class Apple {
	String name;	// 이름
	int price;		// 가격
	int count;		// 갯수
	
	Apple (String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
}

class Banana {
	String name;	// 이름
	int price;		// 가격
	int count;		// 갯수
	
	Banana (String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

class Strawberry {
	String name;	// 이름
	int price;		// 가격
	int count;		// 갯수
	
	Strawberry (String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

public class Ex01 {
	
	// 배열의 객체를 매개 변수로 받아서 총 가격을 출력
	void totalPrice (Object[] obj) {
	/*	int sum = ((Apple)obj[0]).price + ((Banana)obj[1]).price + ((Strawberry)obj[2]).price;
		System.out.println("배열의 객체 매개 변수의 총 가격은 " + sum + "원입니다.");
		*/
		// 합계를 구하는 변수 선언
		int sumApple = 0;		// price * count
		int sumBanana = 0;
		int sumStrawberry = 0;
		
		// 배열 변수로 선언
		int[] sum = new int[3];	// sum[0]: Apple, sum[1]: Banana, sum[2]: Strawberry
		if (obj[0] instanceof Apple) {
		sum[0] = ((Apple)obj[0]).price * ((Apple)obj[0]).count;
		}
		if (obj[1] instanceof Banana) {
		sum[1] = ((Banana)obj[1]).price * ((Banana)obj[1]).count;
		}
		if (obj[2] instanceof Strawberry) {
		sum[2] = ((Strawberry)obj[2]).price * ((Strawberry)obj[2]).count;
		}
		
		System.out.println("사과의 합은 " + sum[0]);
		System.out.println("바나나의 합은 " + sum[1]);
		System.out.println("딸기의 합은 " + sum[2]);
		System.out.println("모든 과일의 총합은 " + (sum[0] + sum[1] + sum[2]));
		
	}

	public static void main(String[] args) {
		/*
		 모든 클래스는 Object의 자식 클래스이다.
		 모든 클래스는 Object의 타입으로 업캐스팅이 가능하다.
		 
		 생성자를 사용해서 각 객체의 값을 할당.
		 사과 2000 5
		 바나나 4000 10
		 딸기 5000 30
		 */
		
		Apple a1 = new Apple("사과",2000,5);
		Banana b1 = new Banana("바나나",4000,10);
		Strawberry s1 = new Strawberry("딸기",5000,30);
		
		// 모든 객체를 Object 배열에 넣습니다.
		// 배열 선언 후 값 할당.
		Object[] arr = new Object[] {a1,b1,s1};
			// a1: Object / Apple
			// b1: Object / Banana
			// s1: Object / Strawberry
		
		Ex01 e1 = new Ex01();
		e1.totalPrice(arr);
	}

}
