package chapter12.ex05;

public class Fluit_Test {

	public static void main(String[] args) {
		
		Fluit f1 = new Apple();
		Fluit f2 = new Strawberry();
		Fluit f3 = new Banana();
		
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
		
		Fluit[] arr = new Fluit[] {f1,f2,f3};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].name();
			arr[i].eat();
			arr[i].color();
		}

		System.out.println("===============");
		
		for(Fluit k : arr) {
			k.name();
			k.eat();
			k.color();
		}
		
	}

}
