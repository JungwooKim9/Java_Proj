package chapter12.ex05;

public class Fluit_Test {

	public static void main(String[] args) {
		
		// 1. 인터페이스는 객체화가 불가능, 타입으로 지정해서 사용
		Fluit f1 = new Apple();
		Fluit f2 = new Strawberry();
		Fluit f3 = new Banana();
		
		// 배열에 넣지 않고 출력
		f1.name();
		f1.eat();
		f1.color();
		
		f2.name();
		f2.eat();
		f2.color();
		
		f3.name();
		f3.eat();
		f3.color();
		
		System.out.println("===============");
		
		// 배열에 넣어서 출력
		Fluit[] arr = new Fluit[] {f1,f2,f3};
		
		// For문을 사용해서 출력
		for(int i=0; i<arr.length; i++) {
			arr[i].name();
			arr[i].eat();
			arr[i].color();
		}

		System.out.println("===============");
		
		// Enhanced For문을 사용해서 출력
		for(Fluit k : arr) {
			k.name();
			k.eat();
			k.color();
		}
		
	}

}
